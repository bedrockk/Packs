package com.bedrockk.packs.description.block;

import com.bedrockk.packs.PackHelper;
import com.bedrockk.packs.annotation.JsonConverter;
import com.bedrockk.packs.description.BlockDescription;
import com.bedrockk.packs.json.VersionConverter;
import com.bedrockk.packs.node.SingleValueNode;
import com.bedrockk.packs.type.SemVersion;
import com.bedrockk.packs.utils.FormatVersions;
import com.fasterxml.jackson.databind.JsonNode;

@JsonConverter(current = BlockDestroyTimeDescription.Converter.class)
public class BlockDestroyTimeDescription extends SingleValueNode<Integer> implements BlockDescription {
	public BlockDestroyTimeDescription(Integer value) {
		super(value);
	}

	public static class Converter implements VersionConverter {

		@Override
		public JsonNode toCurrent(JsonNode value, SemVersion version) {
			return version.isLower(FormatVersions.V1_16_0) && value.isDouble() ? PackHelper.toJsonNode((int) value.get("value").asDouble() * 20) : value;
		}
	}
}
