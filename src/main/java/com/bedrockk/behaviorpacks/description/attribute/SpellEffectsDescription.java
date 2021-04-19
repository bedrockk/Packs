package com.bedrockk.behaviorpacks.description.attribute;

import lombok.Data;

import java.util.List;

@Data
public class SpellEffectsDescription implements AttributeDescription {
    private List<Effect> addEffects;
    private List<String> removeEffects;

    @Data
    public static class Effect {
        private String effect;
        private int duration;
        private int amplifier;
        private boolean visible;
        private boolean ambient;
        private boolean displayOnScreenAnimation;
    }
}
