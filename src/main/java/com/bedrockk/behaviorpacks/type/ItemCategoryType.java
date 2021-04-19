package com.bedrockk.behaviorpacks.type;

public enum ItemCategoryType {
    NATURE,
    CONSTRUCTION,
    ITEMS,
    EQUIPMENT,
    NONE,
    COMMANDS;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
