package com.bedrockk.packs.definition.entity;

import lombok.Data;

@Data
public class KnockbackResistanceDefinition implements EntityComponentDefinition {
	private double value;
	private double max;
}
