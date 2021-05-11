package com.bedrockk.packs.definition.entity;

import lombok.Data;

@Data
public class WaterMovementDefinition extends MovementDefinition {

	private double dragFactor = 0.8;
}