package com.bedrockk.packs.description.block;

import com.bedrockk.packs.description.BlockDescription;
import com.bedrockk.packs.json.VersionedConverter;
import com.bedrockk.packs.node.SingleValueNode;
import com.bedrockk.packs.utils.FormatVersions;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(converter = BlockMapColorDescription.Converter.class)
public class BlockMapColorDescription extends SingleValueNode<Integer> implements BlockDescription {
	public BlockMapColorDescription(Integer value) {
		super(value);
	}

	public static class Converter extends VersionedConverter<JsonNode> {
		@Override
		public JsonNode convert(JsonNode node) {
			if (node.isObject() && this.getVersion().isLower(FormatVersions.V1_16_0)) {
				return node.get("color");
			}
			return node;
		}
	}
}