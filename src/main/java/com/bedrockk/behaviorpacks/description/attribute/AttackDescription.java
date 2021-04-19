package com.bedrockk.behaviorpacks.description.attribute;

import com.bedrockk.behaviorpacks.type.Range;
import lombok.Data;

@Data
public class AttackDescription implements AttributeDescription {
    private Range damage;
    private double effectDuration = 0.0;
    private String effectName;
}
