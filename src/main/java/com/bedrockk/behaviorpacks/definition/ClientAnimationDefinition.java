package com.bedrockk.behaviorpacks.definition;

import com.bedrockk.behaviorpacks.PackHelper;
import com.bedrockk.behaviorpacks.node.PackNode;
import com.bedrockk.behaviorpacks.type.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.Data;

import java.util.*;

@Data
public class ClientAnimationDefinition implements Definition {
	private SemVersion formatVersion;
	private Map<String, Animation> animations;

	@Data
	public static class Animation implements PackNode {
		private double animationLength;
		private AnimationLoopType loop;
		private ExpressionNode startDelay;
		private ExpressionNode loopDelay;
		private ExpressionNode animTimeUpdate;
		private ExpressionNode blendWeight;
		private boolean overridePreviousAnimation;
		private List<Bone> bones;
		private TimeMap<JsonList<ClientAnimationControllerDefinition.Particle>> particleEffects;
		private TimeMap<JsonList<ClientAnimationControllerDefinition.Sound>> soundEffects;
	}

	@Data
	public static class Bone implements PackNode {
		private RelativeTo relativeTo;
		private TimeMap<ChangeEntry> position;
		private TimeMap<ChangeEntry> rotation;
		private TimeMap<ChangeEntry> scale;
	}

	@Data
	public static class ChangeEntry implements PackNode {
		public static final int TYPE_OBJECT = 0;
		public static final int TYPE_ARRAY = 1;
		public static final int TYPE_STRING = 2;

		private LerpType lerpMode = LerpType.LINEAR;
		private List<ExpressionNode> pre;
		private List<ExpressionNode> post;

		private int type = TYPE_OBJECT;

		@JsonCreator
		public static ChangeEntry fromJson(JsonNode node) {
			var entry = new ChangeEntry();
			if (node.isObject()) {
				entry.type = TYPE_OBJECT;
				if (node.has("lerp_mode")) {
					entry.lerpMode = PackHelper.MAPPER.convertValue(node.get("lerp_mode"), new TypeReference<>() {});
				}
				if (node.has("pre")) {
					entry.pre = PackHelper.MAPPER.convertValue(node.get("pre"), new TypeReference<>() {});
				}
				if (node.has("post")) {
					entry.post = PackHelper.MAPPER.convertValue(node.get("post"), new TypeReference<>() {});
				}
			} else if (node.isArray()) {
				entry.type = TYPE_ARRAY;
				entry.pre = new ArrayList<>();
				for (int i = 0; i < node.size(); i++) {
					entry.pre.add(PackHelper.MAPPER.convertValue(node.get(i), ExpressionNode.class));
				}
			} else {
				var a = PackHelper.MAPPER.convertValue(node, ExpressionNode.class);
				entry.pre = Arrays.asList(a, a, a);
				entry.type = TYPE_STRING;
			}
			return entry;
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
