package com.bedrockk.behaviorpacks.definition.item;

import lombok.Data;

@Data
public class FertilizerDefinition implements ItemComponentDefinition {
    public Type type;

    public enum Type {
        BONEMEAL,
        RAPID;

        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }
}
