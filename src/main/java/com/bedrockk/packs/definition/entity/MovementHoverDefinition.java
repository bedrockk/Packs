package com.bedrockk.packs.definition.entity;

import lombok.Data;

@Data
public class MovementHoverDefinition implements EntityComponentDefinition {
	private double value;
	private double maxTurn = 30.0;
}