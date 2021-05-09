package com.bedrockk.behaviorpacks.type;

import com.bedrockk.behaviorpacks.PackHelper;
import com.bedrockk.behaviorpacks.description.Description;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ItemSelector implements Description {
	private final String name;
	private final List<String> anyTags;

	public ItemSelector(String name) {
		this(name, new ArrayList<>());
	}

	public ItemSelector(List<String> anyTags) {
		this(null, anyTags);
	}

	public ItemSelector(String name, List<String> anyTags) {
		this.name = name;
		this.anyTags = anyTags;
	}

	@JsonCreator
	public static ItemSelector fromJson(JsonNode node) {
		if (node.isTextual()) {
			return new ItemSelector(node.asText());
		} else if (node.isObject()) {
			String name = node.has("name") ? node.get("name").asText() : null;
			List<String> tags = node.findValuesAsText("any_tag");

			return new ItemSelector(name, tags);
		}

		return null;
	}

	@JsonValue
	public JsonNode toJson() {
		if (anyTags.isEmpty()) {
			return PackHelper.MAPPER.convertValue(name, JsonNode.class);
		} else {
			ObjectNode node = PackHelper.MAPPER.createObjectNode();
			ArrayNode arrayNode = PackHelper.MAPPER.createArrayNode();
			arrayNode.addAll(anyTags.stream()
					.map(s -> PackHelper.MAPPER.convertValue(s, JsonNode.class))
					.collect(Collectors.toList())
			);
			node.set("any_tag", arrayNode);
			if (name != null) {
				node.set("name", PackHelper.MAPPER.convertValue(name, JsonNode.class));
			}

			return node;
		}
	}

	public String getName() {
		return name;
	}

	public List<String> getAnyTags() {
		return anyTags;
	}
}
