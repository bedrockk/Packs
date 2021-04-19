package com.bedrockk.behaviorpacks.description;

import com.bedrockk.behaviorpacks.BehaviorPackFactory;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BlockDescription implements Description {
    private final String name;
    private final List<String> anyTags;

    public BlockDescription(String name) {
        this(name, new ArrayList<>());
    }

    public BlockDescription(List<String> anyTags) {
        this(null, anyTags);
    }

    public BlockDescription(String name, List<String> anyTags) {
        this.name = name;
        this.anyTags = anyTags;
    }

    @JsonCreator
    public static BlockDescription fromJson(JsonNode node) {
        if (node.isTextual()) {
            return new BlockDescription(node.asText());
        } else if (node.isObject()) {
            String name = node.has("name") ? node.get("name").asText() : null;
            List<String> tags = node.findValuesAsText("any_tag");

            return new BlockDescription(name, tags);
        }

        return null;
    }

    @JsonValue
    public JsonNode toJson() {
        if (anyTags.isEmpty()) {
            return BehaviorPackFactory.MAPPER.convertValue(name, JsonNode.class);
        } else {
            ObjectNode node = BehaviorPackFactory.MAPPER.createObjectNode();
            ArrayNode arrayNode = BehaviorPackFactory.MAPPER.createArrayNode();
            arrayNode.addAll(anyTags.stream()
                    .map(s -> BehaviorPackFactory.MAPPER.convertValue(s, JsonNode.class))
                    .collect(Collectors.toList())
            );
            node.set("any_tag", arrayNode);
            if (name != null) {
                node.set("name", BehaviorPackFactory.MAPPER.convertValue(name, JsonNode.class));
            }

            return node;
        }
    }

    public String getName() {
        return name;
    }

    public List<String> getAnyTags() {
        return anyTags;
    }
}
