package com.bedrockk.packs.definition.event;

import com.bedrockk.packs.PackHelper;
import com.bedrockk.packs.definition.EntityFilterDefinition;
import com.bedrockk.packs.node.PackNode;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SequenceEntry<T> implements PackNode {
	private EntityFilterDefinition filters;
	private T bundle;

	@JsonCreator
	public static <E> SequenceEntry<E> fromJson(ObjectNode node) {
		return new SequenceEntry<>(
				PackHelper.convert(node.remove("filters"), new TypeReference<>() {}),
				PackHelper.convert(node, new TypeReference<>() {})
		);
	}

	@JsonValue
	public ObjectNode toJson() {
		var node = (ObjectNode) PackHelper.toJsonNode(bundle);
		node.set("filters", PackHelper.toJsonNode(filters));
		return node;
	}
}