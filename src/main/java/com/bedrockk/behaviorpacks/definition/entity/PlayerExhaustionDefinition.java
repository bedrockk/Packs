package com.bedrockk.behaviorpacks.definition.entity;

import lombok.Data;

@Data
public class PlayerExhaustionDefinition implements EntityComponentDefinition {
	private double value;
	private double max;
	private double min;
}