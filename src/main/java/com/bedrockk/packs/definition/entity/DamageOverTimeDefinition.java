package com.bedrockk.packs.definition.entity;

import lombok.Data;

@Data
public class DamageOverTimeDefinition implements EntityComponentDefinition {

	private int damagePerHurt = 1;
	private double timeBetweenHurt = 0.0;
}