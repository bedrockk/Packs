package com.bedrockk.packs.type;

import com.bedrockk.packs.PackHelper;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;

public record WeightedEntry<T>(int type, T value, int weight) {
	public static final int TYPE_ARRAY = 0;
	public static final int TYPE_PLAIN = 1;

	@JsonCreator
	public static <E> WeightedEntry<E> fromJson(JsonNode node) {
		if (!node.isArray()) {
			return new WeightedEntry<>(TYPE_PLAIN, PackHelper.MAPPER.convertValue(node, new TypeReference<>() {
			}), 1);
		}
		return new WeightedEntry<>(TYPE_ARRAY, PackHelper.MAPPER.convertValue(node.get(0), new TypeReference<>() {
		}), node.get(1).asInt());
	}

	@JsonValue
	public JsonNode toJson() {
		if (type == TYPE_PLAIN) {
			return PackHelper.toJsonNode(value);
		}
		var node = PackHelper.MAPPER.createArrayNode();
		node.set(0, PackHelper.toJsonNode(value));
		node.set(1, PackHelper.toJsonNode(weight));
		return node;
	}
}