package com.bedrockk.behaviorpacks.definition.item;

import lombok.Data;

@Data
public class DoorDefinition implements ItemComponentDefinition {
    private MaterialType material;
    private DoorType type;

    public enum MaterialType {
        WOOD,
        METAL;

        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }

    public enum DoorType {
        ACACIA,
        BIRCH,
        DARK_OAK,
        IRON,
        JUNGLE,
        SPRUCE,
        OAK;

        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }
}
