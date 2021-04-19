package com.bedrockk.behaviorpacks.type;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Value;

@Value
public class AnimationEvent {
    public static final int TYPE_ENTITY_EVENT = 0;
    public static final int TYPE_COMMAND = 1;
    public static final int TYPE_MOLANG_EXPRESSION = 2;

    int type;
    Object event;

    @JsonCreator
    public static AnimationEvent fromJson(String event) {
        if (event.startsWith("@s ")) {
            return new AnimationEvent(TYPE_ENTITY_EVENT, event.substring(3));
        } else if (event.startsWith("/")) {
            return new AnimationEvent(TYPE_COMMAND, event.substring(1));
        } else {
            return new AnimationEvent(TYPE_MOLANG_EXPRESSION, new MolangExpression(event));
        }
    }

    @JsonValue
    public String toJson() {
        if (this.type == TYPE_ENTITY_EVENT) {
            return "@s " + this.event;
        } else if (this.type == TYPE_COMMAND) {
            return "/" + this.event;
        }

        return this.event.toString();
    }

    public String asString() {
        return (String) this.event;
    }

    public MolangExpression asExpression() {
        return (MolangExpression) this.event;
    }
}