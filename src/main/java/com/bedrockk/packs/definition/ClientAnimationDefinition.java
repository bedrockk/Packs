package com.bedrockk.packs.definition;

import com.bedrockk.packs.PackHelper;
import com.bedrockk.packs.json.VersionPropertyDeserializer;
import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.node.VersionedNode;
import com.bedrockk.packs.type.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.*;
import lombok.extern.jackson.Jacksonized;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;

@Data
@Builder
@Jacksonized
public class ClientAnimationDefinition implements VersionedNode, Definition {
	@JsonDeserialize(using = VersionPropertyDeserializer.class)
	private SemVersion formatVersion;
	@Singular
	private Map<String, Animation> animations;

	@Data
	@Builder
	@Jacksonized
	public static class Animation implements PackNode {
		private double animationLength;
		private AnimationLoopType loop;
		private ExpressionNode startDelay;
		private ExpressionNode loopDelay;
		private ExpressionNode animTimeUpdate;
		private ExpressionNode blendWeight;
		private boolean overridePreviousAnimation;
		@Singular
		private List<Bone> bones;
		private TimeMap<JsonList<ClientAnimationControllerDefinition.Particle>> particleEffects;
		private TimeMap<JsonList<ClientAnimationControllerDefinition.Sound>> soundEffects;
	}

	@Data
	@Builder
	@Jacksonized
	public static class Bone implements PackNode {
		private RelativeTo relativeTo;
		private TimeMap<ChangeEntry> position;
		private TimeMap<ChangeEntry> rotation;
		private TimeMap<ChangeEntry> scale;
	}

	@Data
	@Builder
	public static class ChangeEntry implements PackNode {
		public static final int TYPE_OBJECT = 0;
		public static final int TYPE_ARRAY = 1;
		public static final int TYPE_STRING = 2;

		@Builder.Default
		private LerpType lerpMode = LerpType.LINEAR;
		@Singular("addPre")
		private List<ExpressionNode> pre;
		@Singular("addPost")
		private List<ExpressionNode> post;

		@Builder.Default
		private int type = TYPE_OBJECT;

		@JsonCreator
		public static ChangeEntry fromJson(JsonNode node) {
			var entry = ChangeEntry.builder();
			if (node.isObject()) {
				entry.type(TYPE_OBJECT);
				if (node.has("lerp_mode")) {
					entry.lerpMode(PackHelper.convert(node.get("lerp_mode"), new TypeReference<>() {}));
				}
				if (node.has("pre")) {
					entry.pre(PackHelper.convert(node.get("pre"), new TypeReference<>() {}));
				}
				if (node.has("post")) {
					entry.post(PackHelper.convert(node.get("post"), new TypeReference<>() {}));
				}
			} else if (node.isArray()) {
				entry.type(TYPE_ARRAY);
				for (int i = 0; i < node.size(); i++) {
					entry.addPre(PackHelper.convert(node.get(i), new TypeReference<>() {}));
				}
			} else {
				ExpressionNode a = PackHelper.convert(node, new TypeReference<>() {});
				entry.pre(Arrays.asList(a, a, a));
				entry.type(TYPE_STRING);
			}
			return entry.build();
		}

		@JsonValue
		public JsonNode toJson() {
			switch (type) {
				case TYPE_STRING:
					return PackHelper.toJsonNode(pre.get(0));
				case TYPE_ARRAY:
					return PackHelper.toJsonNode(pre);
				default:
				case TYPE_OBJECT:
					var node = PackHelper.MAPPER.createObjectNode();
					node.set("lerp_mode", PackHelper.toJsonNode(lerpMode));
					node.set("pre", PackHelper.toJsonNode(pre));
					node.set("post", PackHelper.toJsonNode(post));
					return node;
			}
		}
	}

	@Data
	@NoArgsConstructor
	@AllArgsConstructor(staticName = "of")
	public static class RelativeTo implements PackNode {
		private String rotation; // enumerated_value<"entity">
	}

	public enum LerpType {
		LINEAR,
		CATMULLROM;

		@Override
		public String toString() {
			return name().toLowerCase(Locale.ENGLISH);
		}
	}
}
