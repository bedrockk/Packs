package com.bedrockk.behaviorpacks.definition.item;

import lombok.Data;

import java.util.Locale;

@Data
public class CooldownDefinition implements ItemComponentDefinition {
    private Category category;
    private double duration;

    public enum Category {
        CHORUSFRUIT,
        ENDER_PEARL;

        @Override
        public String toString() {
            return name().toLowerCase(Locale.ENGLISH);
        }
    }
}
