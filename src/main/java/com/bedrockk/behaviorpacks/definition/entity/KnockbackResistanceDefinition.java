package com.bedrockk.behaviorpacks.definition.entity;

import lombok.Data;

@Data
public class KnockbackResistanceDefinition implements EntityComponentDefinition {
	private double value;
	private double max;
}
