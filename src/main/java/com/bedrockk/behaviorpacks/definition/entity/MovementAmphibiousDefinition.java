package com.bedrockk.behaviorpacks.definition.entity;

import lombok.Data;

@Data
public class MovementAmphibiousDefinition implements EntityComponentDefinition {
	private double maxTurn = 30.0;
}