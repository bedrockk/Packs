package com.bedrockk.behaviorpacks.definition.item;

import lombok.Data;

@Data
public class SignDefinition implements ItemComponentDefinition {
    private SignType type;

    public enum SignType {
        ACACIA,
        BIRCH,
        DARK_OAK,
        JUNGLE,
        OAK,
        SPRUCE;

        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }
}
