package com.bedrockk.packs.type;

import com.bedrockk.packs.PackHelper;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.NonNull;

public record ConditionalEntry(@NonNull String name, ExpressionNode condition) {
	@JsonCreator
	public static ConditionalEntry fromJson(JsonNode node) {
		if (node.isObject()) {
			var name = node.fieldNames().next();
			return new ConditionalEntry(name, new ExpressionNode(node.get(name).asText()));
		}
		return new ConditionalEntry(node.asText(), null);
	}

	@JsonValue
	public JsonNode toJson() {
		if (condition != null) {
			var node = PackHelper.MAPPER.createObjectNode();
			node.set(name, PackHelper.toJsonNode(condition));
			return node;
		}
		return PackHelper.toJsonNode(name);
	}
}
