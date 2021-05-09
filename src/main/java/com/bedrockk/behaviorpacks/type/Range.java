package com.bedrockk.behaviorpacks.type;

import com.bedrockk.behaviorpacks.PackHelper;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public record Range(double min, double max, int type) {
	public static final int TYPE_OBJECT = 0;
	public static final int TYPE_OBJECT_RANGE = 1;
	public static final int TYPE_OBJECT_DISTANCE = 2;
	public static final int TYPE_ARRAY = 3;
	public static final int TYPE_PLAIN = 4;

	@JsonCreator
	public static Range fromJson(JsonNode node) {
		if (node.isObject()) {
			if (node.has("range_min")) {
				return new Range(node.get("range_min").asDouble(), node.get("range_max").asDouble(), TYPE_OBJECT_RANGE);
			} else if (node.has("min_distance")) {
				return new Range(node.get("min_distance").asDouble(), node.get("max_distance").asDouble(), TYPE_OBJECT_DISTANCE);
			}
			return new Range(node.get("min").asDouble(), node.get("max").asDouble(), TYPE_OBJECT);
		} else if (node.isArray()) {
			return new Range(node.get(0).asDouble(), node.get(1).asDouble(), TYPE_ARRAY);
		} else {
			return new Range(0, node.asDouble(), TYPE_PLAIN);
		}
	}

	@JsonValue
	public JsonNode toJson() {
		switch (this.type) {
			default:
			case TYPE_OBJECT:
			case TYPE_OBJECT_RANGE:
			case TYPE_OBJECT_DISTANCE:
				ObjectNode node = PackHelper.MAPPER.createObjectNode();
				JsonNode castedMin = this.castToNearest(this.min);
				JsonNode castedMax = this.castToNearest(this.max);

				switch (this.type) {
					case TYPE_OBJECT -> {
						node.set("min", castedMin);
						node.set("max", castedMax);
					}
					case TYPE_OBJECT_RANGE -> {
						node.set("range_min", castedMin);
						node.set("range_max", castedMax);
					}
					case TYPE_OBJECT_DISTANCE -> {
						node.set("min_distance", castedMin);
						node.set("max_distance", castedMax);
					}
				}

				return node;
			case TYPE_ARRAY:
				ArrayNode node2 = PackHelper.MAPPER.createArrayNode();
				node2.add(this.castToNearest(this.min));
				node2.add(this.castToNearest(this.max));
				return node2;
			case TYPE_PLAIN:
				return this.castToNearest(this.max);
		}
	}

	private JsonNode castToNearest(Double value) {
		return PackHelper.toJsonNode(value % 1 == 0 ? value.intValue() : value);
	}
}
