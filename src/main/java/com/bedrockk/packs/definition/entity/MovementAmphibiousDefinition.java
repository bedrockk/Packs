package com.bedrockk.packs.definition.entity;

import lombok.Data;

@Data
public class MovementAmphibiousDefinition implements EntityComponentDefinition {
	private double maxTurn = 30.0;
}