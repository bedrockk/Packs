package com.bedrockk.behaviorpacks.type;

import com.bedrockk.behaviorpacks.PackHelper;
import com.bedrockk.behaviorpacks.node.PackNode;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public record AnimationEntry(String animation, ExpressionNode condition) implements PackNode {
	@JsonCreator
	public static AnimationEntry fromJson(JsonNode node) {
		if (node.isObject()) {
			String name = node.fieldNames().next();
			return new AnimationEntry(name, new ExpressionNode(node.get(name).asText()));
		}
		return new AnimationEntry(node.asText(), null);
	}

	@JsonValue
	public JsonNode toJson() {
		if (this.condition == null) {
			return PackHelper.toJsonNode(this.animation);
		}

		ObjectNode node = PackHelper.MAPPER.createObjectNode();
		node.set(this.animation, PackHelper.toJsonNode(this.condition));
		return node;
	}
}