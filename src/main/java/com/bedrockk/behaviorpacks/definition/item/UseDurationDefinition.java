package com.bedrockk.behaviorpacks.definition.item;

import com.bedrockk.behaviorpacks.PackHelper;
import com.bedrockk.behaviorpacks.json.VersionedConverter;
import com.bedrockk.behaviorpacks.node.SingleValueNode;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(converter = UseDurationDefinition.Converter.class)
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
