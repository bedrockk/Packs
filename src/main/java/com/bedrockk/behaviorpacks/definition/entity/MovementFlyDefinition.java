package com.bedrockk.behaviorpacks.definition.entity;

import lombok.Data;

@Data
public class MovementFlyDefinition implements EntityComponentDefinition {
	private double value;
	private double maxTurn = 30.0;
}