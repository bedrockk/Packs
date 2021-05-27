package com.bedrockk.packs.description.block;

import com.bedrockk.packs.PackHelper;
import com.bedrockk.packs.annotation.JsonConverter;
import com.bedrockk.packs.description.BlockDescription;
import com.bedrockk.packs.json.VersionedConverter;
import com.bedrockk.packs.node.SingleValueNode;
import com.bedrockk.packs.utils.FormatVersions;
import com.fasterxml.jackson.databind.JsonNode;

@JsonConverter(current = BlockDestroyTimeDescription.Converter.class)
public class BlockDestroyTimeDescription extends SingleValueNode<Integer> implements BlockDescription {
	public BlockDestroyTimeDescription(Integer value) {
		super(value);
	}

	public static class Converter extends VersionedConverter<JsonNode> {
		@Override
		public JsonNode convert(JsonNode node) {
			if (node.isObject() && this.getVersion().isLower(FormatVersions.V1_16_0)) {
				return PackHelper.toJsonNode((int) node.get("value").asDouble() * 20); // convert to ticks
			}
			return node;
		}
	}
}
