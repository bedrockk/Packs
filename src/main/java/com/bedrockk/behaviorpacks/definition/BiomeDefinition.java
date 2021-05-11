package com.bedrockk.behaviorpacks.definition;

import com.bedrockk.behaviorpacks.PackHelper;
import com.bedrockk.behaviorpacks.definition.biome.BiomeComponentDefinition;
import com.bedrockk.behaviorpacks.description.definition.SimpleDefinitionDescription;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public class BiomeDefinition extends VersionedDefinition {
	private SimpleDefinitionDescription description;
	private Map<String, BiomeComponentDefinition> components;
	private List<String> tags;

	@JsonCreator
	public static BiomeDefinition fromJson(JsonNode node) {
		var def = new BiomeDefinition();
		def.description = PackHelper.MAPPER.convertValue(node.get("description"), new TypeReference<>() {});
		def.tags = new ArrayList<>();
		var comps = (ObjectNode) node.get("components");

		for (var it = comps.fieldNames(); it.hasNext();) {
			var name = it.next();
			if (!name.startsWith("minecraft:")) {
				def.tags.add(name);
				comps.remove(name);
			}
		}

		def.components = PackHelper.MAPPER.convertValue(comps, new TypeReference<>() {});
		return def;
	}

	@JsonValue
	public JsonNode toJson() {
		var node = PackHelper.MAPPER.createObjectNode();
		node.set("description", PackHelper.toJsonNode(description));
		var comps = (ObjectNode) PackHelper.toJsonNode(components);
		comps.setAll((ObjectNode) PackHelper.toJsonNode(tags));
		node.set("components", comps);
		return node;
	}
}
