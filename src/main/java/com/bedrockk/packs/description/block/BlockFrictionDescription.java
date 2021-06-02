package com.bedrockk.packs.description.block;

import com.bedrockk.packs.annotation.JsonConverter;
import com.bedrockk.packs.description.BlockDescription;
import com.bedrockk.packs.json.VersionConverter;
import com.bedrockk.packs.node.SingleValueNode;
import com.bedrockk.packs.type.SemVersion;
import com.bedrockk.packs.utils.FormatVersions;
import com.fasterxml.jackson.databind.JsonNode;

@JsonConverter(current = BlockFrictionDescription.Converter.class)
public class BlockFrictionDescription extends SingleValueNode<Double> implements BlockDescription {
	public BlockFrictionDescription(Double value) {
		super(value);
	}

	public static class Converter extends VersionConverter<BlockFrictionDescription> {

		@Override
		public boolean isValid(SemVersion version) {
			return version.isLower(FormatVersions.V1_16_0);
		}

		@Override
		public JsonNode apply(JsonNode value) {
			return value.isDouble() ? value.get("value") : value;
		}
	}
}
