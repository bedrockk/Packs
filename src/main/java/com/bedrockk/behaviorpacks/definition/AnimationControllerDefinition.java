package com.bedrockk.behaviorpacks.definition;

import com.bedrockk.behaviorpacks.PackHelper;
import com.bedrockk.behaviorpacks.node.PackNode;
import com.bedrockk.behaviorpacks.type.AnimationEvent;
import com.bedrockk.behaviorpacks.type.ExpressionNode;
import com.bedrockk.behaviorpacks.type.SemVersion;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.Data;
import lombok.Value;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@Data
public class AnimationControllerDefinition implements Definition {
    private SemVersion formatVersion;
    @JsonProperty("animation_controllers")
    private Map<String, AnimationController> controllers;

    @Data
    public static class AnimationController implements PackNode {
        private String initialState;
        private Map<String, State> states;
    }

    @Data
    public static class State implements PackNode {
        private List<AnimationEntry> animations = Collections.emptyList();
        private List<Map<String, ExpressionNode>> transitions = Collections.emptyList();
        private List<AnimationEvent> onEntry = Collections.emptyList();
        private List<AnimationEvent> onExit = Collections.emptyList();
    }

    public record AnimationEntry(String animation, ExpressionNode condition) implements PackNode {
        @JsonCreator
        public static AnimationEntry fromJson(Map<String, ExpressionNode> map) {
            String name = map.keySet().toArray(new String[0])[0];
            return new AnimationEntry(name, map.get(name));
        }

        @JsonCreator
        public static AnimationEntry fromJson(String animation) {
            return new AnimationEntry(animation, null);
        }

        @JsonValue
        public JsonNode toJson() {
            if (this.condition == null) {
                return PackHelper.toJsonNode(this.animation);
            }

            ObjectNode node = PackHelper.MAPPER.createObjectNode();
            node.set(this.animation, PackHelper.toJsonNode(this.condition));
            return node;
        }
    }
}
