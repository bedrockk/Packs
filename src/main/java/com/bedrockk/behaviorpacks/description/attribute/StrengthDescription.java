package com.bedrockk.behaviorpacks.description.attribute;

import lombok.Data;

@Data
public class StrengthDescription implements AttributeDescription {
    private int max = 5;
    private int value = 1;
}
