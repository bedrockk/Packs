package com.bedrockk.packs.definition.entity;

import lombok.Data;

@Data
public class MovementGlideDefinition implements EntityComponentDefinition {
	private double value;
	private double maxTurn = 30.0;
	private double startSpeed;
	private double speedWhenTurning;
}