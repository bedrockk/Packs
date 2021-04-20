package com.bedrockk.behaviorpacks.type;

import com.bedrockk.behaviorpacks.BehaviorPackFactory;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import lombok.Value;

import java.util.List;

@Value
public class Range {
    public static final int TYPE_OBJECT = 0;
    public static final int TYPE_OBJECT_RANGE = 1;
    public static final int TYPE_ARRAY = 2;
    public static final int TYPE_PLAIN = 3;

    double min;
    double max;
    int type;

    @JsonCreator
    public static Range fromJson(JsonNode node) {
        if (node.isObject()) {
            if (node.has("range_min")) { // ??
                return new Range(node.get("range_min").asDouble(), node.get("range_max").asDouble(), TYPE_OBJECT_RANGE);
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
                ObjectNode node = BehaviorPackFactory.MAPPER.createObjectNode();
                node.set(this.type == TYPE_OBJECT_RANGE ? "range_min" : "min", this.castToNearest(this.min));
                node.set(this.type == TYPE_OBJECT_RANGE ? "range_max" : "max", this.castToNearest(this.max));
                return node;
            case TYPE_ARRAY:
                ArrayNode node2 = BehaviorPackFactory.MAPPER.createArrayNode();
                node2.add(this.castToNearest(this.min));
                node2.add(this.castToNearest(this.max));
                return node2;
            case TYPE_PLAIN:
                return this.castToNearest(this.max);
        }
    }

    private JsonNode castToNearest(Double value) {
        return BehaviorPackFactory.toJsonNode(value % 1 == 0 ? value.intValue() : value);
    }
}
