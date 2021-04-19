package com.bedrockk.behaviorpacks.description.property;

import lombok.Data;

@Data
public class AmbientSoundIntervalDescription implements PropertyDescription {
    private String eventName;
    private double range = 16.0; // max
    private double value = 8.0; // min
}
