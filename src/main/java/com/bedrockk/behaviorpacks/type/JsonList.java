package com.bedrockk.behaviorpacks.type;

import com.bedrockk.behaviorpacks.BehaviorPackFactory;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class JsonList<E> extends ArrayList<E> {

    @JsonCreator
    public static <T> JsonList<T> fromJson(JsonNode node) {
        if (node.isArray()) {
            JsonList<T> list = new JsonList<>();
            node.elements().forEachRemaining(p -> list.add(BehaviorPackFactory.MAPPER.convertValue(p, new TypeReference<T>() {})));

            return list;
        } else {
            T type = BehaviorPackFactory.MAPPER.convertValue(node, new TypeReference<T>() {});

            return new JsonList<T>() {
                {
                    add(type);
                }
            };
        }
    }

    @JsonValue
    public JsonNode toJson() {
        if (this.size() == 1) {
            return BehaviorPackFactory.toJsonNode(get(0));
        } else {
            ArrayNode node = BehaviorPackFactory.MAPPER.createArrayNode();
            node.addAll(this.stream().map(BehaviorPackFactory::toJsonNode).collect(Collectors.toList()));

            return node;
        }
    }
}
