package com.bedrockk.packs.type;

import com.bedrockk.packs.PackHelper;
import com.bedrockk.packs.description.Description;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.Builder;
import lombok.Singular;

import java.util.ArrayList;
import java.util.List;

@Builder
public class ItemSelector implements Description {
	private final String name;
	@Singular("tag")
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
			var name = node.has("name") ? node.get("name").asText() : null;
			var tags = node.findValuesAsText("any_tag");
			return new ItemSelector(name, tags);
		}
		return new ItemSelector(node.asText());
	}

	@JsonValue
	public JsonNode toJson() {
		if (!anyTags.isEmpty()) {
			var node = PackHelper.MAPPER.createObjectNode();
			node.set("any_tag", PackHelper.toJsonNode(anyTags));
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
