package com.bedrockk.behaviorpacks.description.entity;

import com.bedrockk.behaviorpacks.description.EntityDescription;
import com.bedrockk.behaviorpacks.type.Range;
import lombok.Data;

@Data
public class AttackDescription implements EntityDescription {
    private Range damage;
    private double effectDuration = 0.0;
    private String effectName;
}
