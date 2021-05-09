package com.bedrockk.behaviorpacks.definition.entity;

import lombok.Data;

@Data
public class RailMovementDefinition implements EntityComponentDefinition {

	private double maxSpeed = 0.4;
}