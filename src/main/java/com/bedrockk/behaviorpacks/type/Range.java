package com.bedrockk.behaviorpacks.type;

import com.bedrockk.behaviorpacks.BehaviorPackFactory;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import lombok.Value;

@Value
public class Range {
    public static final int TYPE_OBJECT = 0;
    public static final int TYPE_ARRAY = 1;
    public static final int TYPE_MAX = 2;

    int min;
    int max;
    int type;

    @JsonCreator
    public static Range fromJson(JsonNode node) {
        if (node.isObject()) {
            return new Range(node.get("min").asInt(), node.get("max").asInt(), TYPE_OBJECT);
        } else if (node.isArray()) {
            return new Range(node.get(0).asInt(), node.get(1).asInt(), TYPE_ARRAY);
        } else {
            return new Range(0, node.asInt(), TYPE_MAX);
        }
    }

    @JsonValue
    public JsonNode toJson() {
        switch (this.type) {
            default:
            case TYPE_OBJECT:
                ObjectNode node = BehaviorPackFactory.MAPPER.createObjectNode();
                node.put("min", this.min);
                node.put("max", this.max);
                return node;
            case TYPE_ARRAY:
                ArrayNode node2 = BehaviorPackFactory.MAPPER.createArrayNode();
                node2.add(this.min);
                node2.add(this.max);
                return node2;
            case TYPE_MAX:
                return BehaviorPackFactory.toJsonNode(this.max);
        }
    }
}
