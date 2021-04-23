package com.bedrockk.behaviorpacks.definition.entity;

import lombok.Data;

@Data
public class SoundVolumeDefinition implements EntityComponentDefinition {
    private double value = 0.0;
}
