package com.bedrockk.behaviorpacks.type;

import java.util.Locale;

public enum FilterTarget {
    BLOCK,
    DAMAGER,
    OTHER,
    PARENT,
    PLAYER,
    SELF,
    TARGET,
    BABY,
    HOLDER;

    @Override
    public String toString() {
        return name().toLowerCase(Locale.ENGLISH);
    }
}