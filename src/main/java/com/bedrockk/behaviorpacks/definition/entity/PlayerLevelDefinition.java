package com.bedrockk.behaviorpacks.definition.entity;

import lombok.Data;

@Data
public class PlayerLevelDefinition implements EntityComponentDefinition {
	private double value;
	private double max;
	private double min;
}