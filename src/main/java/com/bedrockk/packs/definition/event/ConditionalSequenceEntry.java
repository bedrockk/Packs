package com.bedrockk.packs.definition.event;

import com.bedrockk.packs.PackHelper;
import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.ExpressionNode;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ConditionalSequenceEntry<T> implements PackNode {
	private ExpressionNode condition;
	private T bundle;

	@JsonCreator
	public static <T> ConditionalSequenceEntry<T> fromJson(ObjectNode node) {
		return new ConditionalSequenceEntry<>(
				PackHelper.convert(node.remove("condition"), new TypeReference<>() {}),
				PackHelper.convert(node, new TypeReference<>() {})
		);
	}

	@JsonValue
	public ObjectNode toJson() {
		var node = (ObjectNode) PackHelper.toJsonNode(bundle);
		node.set("condition", PackHelper.toJsonNode(condition));
		return node;
	}
}