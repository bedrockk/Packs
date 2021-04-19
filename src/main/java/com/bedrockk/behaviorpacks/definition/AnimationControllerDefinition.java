package com.bedrockk.behaviorpacks.definition;

import com.bedrockk.behaviorpacks.BehaviorPackFactory;
import com.bedrockk.behaviorpacks.type.AnimationEvent;
import com.bedrockk.behaviorpacks.type.MolangExpression;
import com.fasterxml.jackson.annotation.JsonCreator;
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
    private String initialState;
    private Map<String, State> states;

    @Data
    public static class State {
        private List<AnimationEntry> animations = Collections.emptyList();
        private List<Map<String, MolangExpression>> transitions = Collections.emptyList();
        private List<AnimationEvent> onEntry = Collections.emptyList();
        private List<AnimationEvent> onExit = Collections.emptyList();
    }

    @Value
    public static class AnimationEntry {
        String animation;
        MolangExpression condition;

        @JsonCreator
        public static AnimationEntry fromJson(Map<String, MolangExpression> map) {
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
                return BehaviorPackFactory.toJsonNode(this.animation);
            }

            ObjectNode node = BehaviorPackFactory.MAPPER.createObjectNode();
            node.set(this.animation, BehaviorPackFactory.toJsonNode(this.condition));
            return node;
        }
    }
}
