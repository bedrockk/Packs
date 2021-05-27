package com.bedrockk.packs.type;

import com.bedrockk.packs.PackHelper;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import java.util.Collections;
import java.util.Map;

@Data
@Builder(builderClassName = "Builder")
public class BlockStateMap {
	public static final BlockStateMap EMPTY = new BlockStateMap(Collections.emptyMap(), Collections.emptyMap(), Collections.emptyMap());

	@Singular("property")
	private Map<String, String> stringMap;
	@Singular("property")
	private Map<String, Number> numberMap;
	@Singular("property")
	private Map<String, Boolean> boolMap;

	public boolean isEmpty() {
		return stringMap.isEmpty() && numberMap.isEmpty() && boolMap.isEmpty();
	}

	public String getString(String name) {
		return stringMap.get(name);
	}

	public Number getNumber(String name) {
		return numberMap.get(name);
	}

	public boolean getBool(String name) {
		return boolMap.get(name);
	}

	@JsonCreator
	public static BlockStateMap fromJson(Map<String, JsonNode> node) {
		var builder = BlockStateMap.builder();
		node.forEach((k, v) -> {
			if (v.isTextual()) {
				builder.property(k, v.textValue());
			} else if (v.isNumber()) {
				builder.property(k, v.numberValue());
			} else if (v.isBoolean()) {
				builder.property(k, v.booleanValue());
			}
		});
		return builder.build();
	}

	@JsonValue
	public ObjectNode toJson() {
		var node = PackHelper.MAPPER.createObjectNode();
		stringMap.forEach((k, v) -> node.set(k, PackHelper.toJsonNode(v)));
		numberMap.forEach((k, v) -> node.set(k, PackHelper.toJsonNode(v)));
		boolMap.forEach((k, v) -> node.set(k, PackHelper.toJsonNode(v)));
		return node;
	}
}
