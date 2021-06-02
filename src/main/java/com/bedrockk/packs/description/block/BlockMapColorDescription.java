package com.bedrockk.packs.description.block;

import com.bedrockk.packs.annotation.JsonConverter;
import com.bedrockk.packs.description.BlockDescription;
import com.bedrockk.packs.json.VersionConverter;
import com.bedrockk.packs.node.SingleValueNode;
import com.bedrockk.packs.type.SemVersion;
import com.bedrockk.packs.utils.FormatVersions;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.JsonNode;

@JsonConverter(current = BlockMapColorDescription.Converter.class)
public class BlockMapColorDescription extends SingleValueNode<Integer> implements BlockDescription {
	@JsonCreator
	public BlockMapColorDescription(Integer value) {
		super(value);
	}

	public static class Converter extends VersionConverter<BlockMapColorDescription> {

		@Override
		public boolean isValid(SemVersion version) {
			return version.isLower(FormatVersions.V1_16_0);
		}

		@Override
		public JsonNode apply(JsonNode node) {
			return node.isObject() ? node.get("color") : node;
		}
	}
}
