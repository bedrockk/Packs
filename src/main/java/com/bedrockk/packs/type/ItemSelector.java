package com.bedrockk.packs.type;

import com.bedrockk.packs.PackHelper;
import com.bedrockk.packs.description.Description;
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
		if (node.isObject()) {
			String name = node.has("name") ? node.get("name").asText() : null;
			List<String> tags = node.findValuesAsText("any_tag");
			return new ItemSelector(name, tags);
		}
		return new ItemSelector(node.asText());
	}

	@JsonValue
	public JsonNode toJson() {
		if (!anyTags.isEmpty()) {
			var node = PackHelper.MAPPER.createObjectNode();
			var arrayNode = PackHelper.MAPPER.createArrayNode();

			arrayNode.addAll(anyTags.stream().map(PackHelper::toJsonNode).collect(Collectors.toList()));
			node.set("any_tag", arrayNode);
			if (name != null) {
				node.set("name", PackHelper.toJsonNode(name));
			}
			return node;
		}
		return PackHelper.toJsonNode(name);
	}

	public String getName() {
		return name;
	}

	public List<String> getAnyTags() {
		return anyTags;
	}
}
