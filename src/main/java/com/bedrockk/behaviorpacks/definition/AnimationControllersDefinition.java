package com.bedrockk.behaviorpacks.definition;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Map;

@Data
public class AnimationControllersDefinition implements Definition {
    private String formatVersion;
    @JsonProperty("animation_controllers")
    private Map<String, AnimationControllerDefinition> controllers;
}
