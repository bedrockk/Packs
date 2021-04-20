package com.bedrockk.behaviorpacks.type;

import com.bedrockk.behaviorpacks.BehaviorPackFactory;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.Value;

@Value
public class BlockReference {
    String name;
    BlockStateMap states;

    @JsonCreator
    public static BlockReference fromJson(String name) {
        return new BlockReference(name, BlockStateMap.EMPTY);
    }

    @JsonCreator
    public static BlockReference fromJson(@JsonProperty("name") String name, @JsonProperty("states") BlockStateMap states) {
        return new BlockReference(name, states);
    }

    @JsonValue
    public JsonNode toJson() {
        if (this.states.isEmpty()) {
            return BehaviorPackFactory.toJsonNode(this.name);
        } else {
            ObjectNode node = BehaviorPackFactory.MAPPER.createObjectNode();
            node.set("name", BehaviorPackFactory.toJsonNode(this.name));
            node.set("states", BehaviorPackFactory.toJsonNode(this.states));
            return node;
        }
    }
}
