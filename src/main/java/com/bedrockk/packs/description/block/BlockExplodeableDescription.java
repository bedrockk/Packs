package com.bedrockk.packs.description.block;

import com.bedrockk.packs.annotation.JsonConverter;
import com.bedrockk.packs.description.BlockDescription;
import com.bedrockk.packs.json.VersionedConverter;
import com.bedrockk.packs.node.SingleValueNode;
import com.bedrockk.packs.utils.FormatVersions;
import com.fasterxml.jackson.databind.JsonNode;

@JsonConverter(current = BlockExplodeableDescription.Converter.class)
public class BlockExplodeableDescription extends SingleValueNode<Double> implements BlockDescription {
	public BlockExplodeableDescription(Double value) {
		super(value);
	}

	public static class Converter extends VersionedConverter<JsonNode> {
		@Override
		public JsonNode convert(JsonNode node) {
			if (node.isObject() && this.getVersion().isLower(FormatVersions.V1_16_0)) {
				return node.get("value");
			}
			return node;
		}
	}
}
