package com.bedrockk.packs.definition.entity;

import lombok.Data;

@Data
public class FrictionModifierDefinition implements EntityComponentDefinition {
	private double value = 1.0;
}
