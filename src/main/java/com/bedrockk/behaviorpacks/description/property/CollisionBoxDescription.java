package com.bedrockk.behaviorpacks.description.property;

import lombok.Data;

@Data
public class CollisionBoxDescription implements PropertyDescription {
    private double height = 1.0;
    private double width = 1.0;
}
