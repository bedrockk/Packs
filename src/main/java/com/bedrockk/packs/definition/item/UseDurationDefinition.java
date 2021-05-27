package com.bedrockk.packs.definition.item;

import com.bedrockk.packs.PackHelper;
import com.bedrockk.packs.annotation.JsonConverter;
import com.bedrockk.packs.json.VersionedConverter;
import com.bedrockk.packs.node.SingleValueNode;
import com.fasterxml.jackson.databind.JsonNode;

@JsonConverter(current = UseDurationDefinition.Converter.class)
public class UseDurationDefinition extends SingleValueNode<Integer> implements ItemComponentDefinition {
	public UseDurationDefinition(Integer value) {
		super(value);
	}

	public static class Converter extends VersionedConverter<JsonNode> {
		@Override
		public JsonNode convert(JsonNode value) {
			if (value.isDouble()) {
				return PackHelper.toJsonNode((int) value.asDouble() * 20);
			}
			return value;
		}
	}
}
