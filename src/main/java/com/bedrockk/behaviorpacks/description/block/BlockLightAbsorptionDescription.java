package com.bedrockk.behaviorpacks.description.block;

import com.bedrockk.behaviorpacks.description.BlockDescription;
import com.bedrockk.behaviorpacks.json.VersionedConverter;
import com.bedrockk.behaviorpacks.node.SingleValueNode;
import com.bedrockk.behaviorpacks.utils.FormatVersions;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(converter = BlockLightAbsorptionDescription.Converter.class)
public class BlockLightAbsorptionDescription extends SingleValueNode<Double> implements BlockDescription {
	public BlockLightAbsorptionDescription(Double value) {
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
