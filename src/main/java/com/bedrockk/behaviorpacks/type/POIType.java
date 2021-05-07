package com.bedrockk.behaviorpacks.type;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Locale;

public enum POIType {
    BED;

    @Override
    @JsonValue
    public String toString() {
        return name().toLowerCase(Locale.ENGLISH);
    }
}
