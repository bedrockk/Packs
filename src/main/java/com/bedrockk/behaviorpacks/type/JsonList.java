package com.bedrockk.behaviorpacks.type;

import com.bedrockk.behaviorpacks.BehaviorPackFactory;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;

import java.util.*;
import java.util.stream.Collectors;

public class JsonList<E> extends ArrayList<E> {

    @JsonCreator
    public static <T> JsonList<T> fromJson(JsonNode node) {
        JsonList<T> list = new JsonList<>();
        if (node.isArray()) {
            for (int i = 0; i < node.size(); i++) {
                list.add(BehaviorPackFactory.MAPPER.convertValue(node.get(i), new TypeReference<T>() {}));
            }
        } else {
            T type = BehaviorPackFactory.MAPPER.convertValue(node, new TypeReference<T>() {});
            list.add(type);
        }
        return list;
    }

    @JsonValue
    public JsonNode toJson() {
        if (this.size() == 1) {
            return BehaviorPackFactory.toJsonNode(this.get(0));
        } else {
            ArrayNode node = BehaviorPackFactory.MAPPER.createArrayNode();
            node.addAll(this.stream().map(BehaviorPackFactory::toJsonNode).collect(Collectors.toList()));

            return node;
        }
    }
}
