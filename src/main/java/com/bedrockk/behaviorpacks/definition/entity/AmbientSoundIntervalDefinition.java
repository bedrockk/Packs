package com.bedrockk.behaviorpacks.definition.entity;

import lombok.Data;

@Data
public class AmbientSoundIntervalDefinition implements EntityComponentDefinition {
	private String eventName;
	private double range = 16.0; // max
	private double value = 8.0; // min
}
