package com.bedrockk.behaviorpacks.definition.item;

import com.bedrockk.behaviorpacks.PackHelper;
import com.bedrockk.behaviorpacks.annotation.JsonSince;
import com.bedrockk.behaviorpacks.json.VersionedConverter;
import com.bedrockk.behaviorpacks.node.ItemComponentNode;
import com.bedrockk.behaviorpacks.node.PackNode;
import com.bedrockk.behaviorpacks.type.ImmutableVec3;
import com.bedrockk.behaviorpacks.utils.FormatVersions;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.Data;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import static com.bedrockk.behaviorpacks.definition.item.RenderOffsetsDefinition.*;

@JsonSince("1.16.200")
public class RenderOffsetsDefinition extends HashMap<HandType, Map<CameraType, RenderOffset>> implements ItemComponentNode {

	@Data
	public static class RenderOffset implements PackNode {
		private ImmutableVec3 position;
		private ImmutableVec3 rotation;
		private ImmutableVec3 scale;
	}

	public static class Converter extends VersionedConverter<JsonNode> {
		@Override
		public JsonNode convert(JsonNode value) {
			if (value.isTextual() && getVersion().isLower(FormatVersions.V1_16_200)) {
				return PackHelper.MAPPER.createObjectNode(); // empty map for now
			}
			return value;
		}
	}

	public enum HandType {
		MAIN_HAND,
		OFF_HAND;

		@Override
		public String toString() {
			return name().toLowerCase(Locale.ENGLISH);
		}
	}

	public enum CameraType {
		FIRST_PERSON,
		THIRD_PERSON;

		@Override
		public String toString() {
			return name().toLowerCase(Locale.ENGLISH);
		}
	}
}
