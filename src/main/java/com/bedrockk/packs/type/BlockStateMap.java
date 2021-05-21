package com.bedrockk.packs.type;

import com.bedrockk.packs.PackHelper;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.Data;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class BlockStateMap {
	public static final BlockStateMap EMPTY = new BlockStateMap() {
		@Override
		public void setString(String name, String value) {
			// NOOP
		}

		@Override
		public void setBool(String name, boolean value) {
			// NOOP
		}

		@Override
		public void setNumber(String name, Number value) {
			// NOOP
		}
	};

	private final Map<String, String> stringMap = new HashMap<>();
	private final Map<String, Number> numberMap = new HashMap<>();
	private final Map<String, Boolean> boolMap = new HashMap<>();

	public boolean isEmpty() {
		return this.stringMap.isEmpty() && this.numberMap.isEmpty() && this.boolMap.isEmpty();
	}

	public String getString(String name) {
		return this.stringMap.get(name);
	}

	public void setString(String name, String value) {
		this.stringMap.put(name, value);
	}

	public Number getNumber(String name) {
		return this.numberMap.get(name);
	}

	public void setNumber(String name, Number value) {
		this.numberMap.put(name, value);
	}

	public boolean getBool(String name) {
		return this.boolMap.get(name);
	}

	public void setBool(String name, boolean value) {
		this.boolMap.put(name, value);
	}

	public Map<String, String> getAllString() {
		return Collections.unmodifiableMap(stringMap);
	}

	public Map<String, Number> getAllNumber() {
		return Collections.unmodifiableMap(numberMap);
	}

	public Map<String, Boolean> getAllBool() {
		return Collections.unmodifiableMap(boolMap);
	}

	@JsonCreator
	public static BlockStateMap fromJson(Map<String, JsonNode> node) {
		BlockStateMap map = new BlockStateMap();
		node.forEach((k, v) -> {
			if (v.isTextual()) {
				map.setString(k, v.textValue());
			} else if (v.isNumber()) {
				map.setNumber(k, v.numberValue());
			} else if (v.isBoolean()) {
				map.setBool(k, v.booleanValue());
			}
		});
		return map;
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
