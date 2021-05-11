package com.bedrockk.behaviorpacks.type;

import com.bedrockk.behaviorpacks.PackHelper;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.stream.Collectors;

public class TimeMap<E> extends HashMap<Double, E> {
	public static final int TYPE_OBJECT = 0;
	public static final int TYPE_ARRAY = 1;
	public static final int TYPE_MINIMIZED = 2;

	private int type = TYPE_OBJECT;

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public E getZero() {
		return get(0.0);
	}

	@JsonCreator
	public static <T> TimeMap<T> fromJson(JsonNode node) {
		var map = new TimeMap<T>();
		if (node.isObject()) {
			for (Iterator<String> it = node.fieldNames(); it.hasNext(); ) {
				String name = it.next();
				map.put(Double.valueOf(name), PackHelper.MAPPER.convertValue(node.get(name), new TypeReference<>() {}));
			}
		} else if (node.isArray()) {
			for (int i = 0; i < node.size(); i++) {
				map.put((double) i, PackHelper.MAPPER.convertValue(node.get(i), new TypeReference<>() {}));
			}
			map.setType(TYPE_ARRAY);
		} else {
			map.put(0.0, PackHelper.MAPPER.convertValue(node, new TypeReference<>() {}));
			map.setType(TYPE_MINIMIZED);
		}
		return map;
	}

	@JsonValue
	public JsonNode toJson() {
		switch (type) {
			case TYPE_MINIMIZED:
				return PackHelper.toJsonNode(get(0.0));
			case TYPE_ARRAY:
				var node1 = PackHelper.MAPPER.createArrayNode();
				for (var entry : entrySet()) {
					node1.set(entry.getKey().intValue(), PackHelper.toJsonNode(entry.getValue()));
				}
				return node1;
			default:
			case TYPE_OBJECT:
				var node = PackHelper.MAPPER.createObjectNode();
				for (var entry : entrySet()) {
					node.set(String.valueOf(entry.getKey()), PackHelper.toJsonNode(entry.getValue()));
				}
				return node;
		}
	}
}
