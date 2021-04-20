package com.bedrockk.behaviorpacks.definition.feature.tree;

import java.util.Locale;

public enum StepDirection {
    DOWN,
    UP,
    OUT,
    AWAY;

    @Override
    public String toString() {
        return name().toLowerCase(Locale.ENGLISH);
    }
}