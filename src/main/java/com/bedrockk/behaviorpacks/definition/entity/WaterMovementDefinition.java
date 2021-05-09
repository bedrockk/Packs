package com.bedrockk.behaviorpacks.definition.entity;

import lombok.Data;

@Data
public class WaterMovementDefinition extends MovementDefinition {

	private double dragFactor = 0.8;
}