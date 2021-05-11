package com.bedrockk.packs.definition.entity;

import lombok.Data;

@Data
public class RailMovementDefinition implements EntityComponentDefinition {

	private double maxSpeed = 0.4;
}