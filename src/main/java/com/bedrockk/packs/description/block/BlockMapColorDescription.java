package com.bedrockk.packs.description.block;

import com.bedrockk.packs.PackHelper;
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
	public BlockMapColorDescription(int value) {
		super(value);
	}

	@JsonCreator
	public static BlockMapColorDescription of(JsonNode node) {
		return new BlockMapColorDescription(node.asInt());
	}

	public static class Converter implements VersionConverter {

		@Override
		public JsonNode toCurrent(JsonNode node, SemVersion version) {
			return version.isLower(FormatVersions.V1_16_0) && node.isObject() ? node.get("color") : node;
		}

		public JsonNode toSpecific(JsonNode node, SemVersion version) {
			if (version.isLower(FormatVersions.V1_16_0) && node.isNumber()) {
				var wrap = PackHelper.MAPPER.createObjectNode();
				wrap.set("value", node);
				return wrap;
			}
			return node;
		}
	}
}
