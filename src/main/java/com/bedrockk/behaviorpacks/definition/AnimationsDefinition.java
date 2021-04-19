package com.bedrockk.behaviorpacks.definition;

import lombok.Data;

import java.util.Map;

@Data
public class AnimationsDefinition implements Definition {
    private String formatVersion;
    private Map<String, AnimationDefinition> animations;
}
