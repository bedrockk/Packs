package com.bedrockk.behaviorpacks.description.entity;

import com.bedrockk.behaviorpacks.description.EntityDescription;
import lombok.Data;

import java.util.List;

@Data
public class SpellEffectsDescription implements EntityDescription {
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
