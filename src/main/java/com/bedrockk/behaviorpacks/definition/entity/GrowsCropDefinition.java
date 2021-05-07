package com.bedrockk.behaviorpacks.definition.entity;

import lombok.Data;

@Data
public class GrowsCropDefinition implements EntityComponentDefinition{
	
	private double chance = 0.0;
	private int charges = 10;
}