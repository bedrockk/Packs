package com.bedrockk.behaviorpacks.definition.entity;

import lombok.Data;

@Data
public class FrictionModifierDefinition implements EntityComponentDefinition {
    private double value = 1.0;
}
