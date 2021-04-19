package com.bedrockk.behaviorpacks.definition.item;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class FoodDefinition implements ItemComponentDefinition {
    private int nutrition;
    private SaturationModifier saturationModifier;
    private String usingConvertsTo;
    private List<Effect> effects = new ArrayList<>();
    private String onUseAction;
    private boolean canAlwaysEat = false;

    @Data
    public static class Effect {
        private String name;
        private double chance;
        private int duration;
        private int amplifier;
    }

    public enum SaturationModifier {
        LOW,
        NORMAL,
        POOR,
        GOOD,
        SUPERNATURAL;

        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }
}
