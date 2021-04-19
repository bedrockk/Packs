package com.bedrockk.behaviorpacks.description;

import com.fasterxml.jackson.annotation.JsonValue;

public abstract class SingleValueDescription<T> implements Description {
    private final T value;

    public SingleValueDescription(T value) {
        this.value = value;
    }

    @JsonValue
    public T getValue() {
        return value;
    }
}
