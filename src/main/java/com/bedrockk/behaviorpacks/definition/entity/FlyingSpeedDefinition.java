package com.bedrockk.behaviorpacks.definition.entity;

import lombok.Data;

@Data
public class FlyingSpeedDefinition implements EntityComponentDefinition {
	private double value = 0.02;
}
