package com.bedrockk.behaviorpacks.definition.entity;

import lombok.Data;

@Data
public class DamageOverTimeDefinition implements EntityComponentDefinition {

	private int damagePerHurt = 1;
	private double timeBetweenHurt = 0.0;
}