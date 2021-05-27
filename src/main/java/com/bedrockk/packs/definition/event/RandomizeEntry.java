package com.bedrockk.packs.definition.event;

import com.bedrockk.packs.PackHelper;
import com.bedrockk.packs.node.PackNode;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RandomizeEntry<T> implements PackNode {
	private int weight;
	private T bundle;

	@JsonCreator
	public static <T> RandomizeEntry<T> fromJson(ObjectNode node) {
		return new RandomizeEntry<>(
				PackHelper.convert(node.remove("weight"), new TypeReference<>() {}),
				PackHelper.convert(node, new TypeReference<>() {})
		);
	}

	@JsonValue
	public ObjectNode toJson() {
		var node = (ObjectNode) PackHelper.toJsonNode(bundle);
		node.set("weight", PackHelper.toJsonNode(weight));
		return node;
	}
}