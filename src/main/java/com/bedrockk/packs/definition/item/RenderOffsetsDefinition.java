package com.bedrockk.packs.definition.item;

import com.bedrockk.packs.PackHelper;
import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.json.VersionedConverter;
import com.bedrockk.packs.node.ItemComponentNode;
import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.ImmutableVec3;
import com.bedrockk.packs.utils.FormatVersions;
import com.bedrockk.packs.utils.MapBuilder;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import static com.bedrockk.packs.definition.item.RenderOffsetsDefinition.*;

@JsonSince("1.16.200")
public class RenderOffsetsDefinition extends HashMap<HandType, Map<CameraType, RenderOffset>> implements ItemComponentNode {

	public static MapBuilder<RenderOffsetsDefinition, HandType, Map<CameraType, RenderOffset>> builder() {
		return new MapBuilder<>(new RenderOffsetsDefinition());
	}

	@Data
	@Builder
	@Jacksonized
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
