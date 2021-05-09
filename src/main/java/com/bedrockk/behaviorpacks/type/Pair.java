package com.bedrockk.behaviorpacks.type;

import com.bedrockk.behaviorpacks.PackHelper;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.node.ArrayNode;

public record Pair<F, S>(F first, S second) {
	@JsonCreator
	public static <A, B> Pair<A, B> fromJson(ArrayNode node) {
		A first = PackHelper.MAPPER.convertValue(node.get(0), new TypeReference<>() {
		});
		B second = PackHelper.MAPPER.convertValue(node.get(1), new TypeReference<>() {
		});
		return new Pair<>(first, second);
	}

	@JsonValue
	public ArrayNode toJson() {
		ArrayNode node = PackHelper.MAPPER.createArrayNode();
		node.add(PackHelper.toJsonNode(this.first));
		node.add(PackHelper.toJsonNode(this.second));
		return node;
	}
}
