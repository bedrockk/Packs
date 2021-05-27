package com.bedrockk.packs.definition;

import com.bedrockk.packs.PackHelper;
import com.bedrockk.packs.definition.biome.BiomeComponentDefinition;
import com.bedrockk.packs.description.definition.SimpleDefinitionDescription;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Singular;
import lombok.experimental.SuperBuilder;

import java.util.List;
import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
public class BiomeDefinition extends VersionedDefinition {
	private SimpleDefinitionDescription description;
	@Singular
	private Map<String, BiomeComponentDefinition> components;
	@Singular
	private List<String> tags;

	@JsonCreator
	public static BiomeDefinition fromJson(JsonNode node) {
		var def = BiomeDefinition.builder();
		def.description(PackHelper.convert(node.get("description"), new TypeReference<>() {}));
		var comps = (ObjectNode) node.get("components");

		for (var it = comps.fieldNames(); it.hasNext(); ) {
			var name = it.next();
			if (!name.startsWith("minecraft:")) {
				def.tag(name);
				comps.remove(name);
			}
		}

		def.components(PackHelper.convert(comps, new TypeReference<>() {}));
		return def.build();
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
