package com.bedrockk.packs.type;

import com.bedrockk.packs.PackHelper;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.node.ArrayNode;

public record Pair<F, S>(F first, S second) {
	@JsonCreator
	public static <A, B> Pair<A, B> fromJson(ArrayNode node) {
		return new Pair<>(
				PackHelper.convert(node.get(0), new TypeReference<>() {}),
				PackHelper.convert(node.get(1), new TypeReference<>() {})
		);
	}

	@JsonValue
	public ArrayNode toJson() {
		ArrayNode node = PackHelper.MAPPER.createArrayNode();
		node.add(PackHelper.toJsonNode(first));
		node.add(PackHelper.toJsonNode(second));
		return node;
	}
}
