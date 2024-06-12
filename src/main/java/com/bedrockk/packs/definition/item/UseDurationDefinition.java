package com.bedrockk.packs.definition.item;

import com.bedrockk.packs.PackHelper;
import com.bedrockk.packs.annotation.JsonConverter;
import com.bedrockk.packs.json.VersionConverter;
import com.bedrockk.packs.node.SingleValueNode;
import com.bedrockk.packs.type.SemVersion;
import com.fasterxml.jackson.databind.JsonNode;

@JsonConverter(current = UseDurationDefinition.Converter.class)
public class UseDurationDefinition extends SingleValueNode<Integer> implements ItemComponentDefinition {
	public UseDurationDefinition(Integer value) {
		super(value);
	}

	public static class Converter implements VersionConverter {
		@Override
		public JsonNode toCurrent(JsonNode value, SemVersion version) {
			return value.isDouble() ? PackHelper.toJsonNode((int) value.asDouble() * 20) : value;
		}
	}
}
