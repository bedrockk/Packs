package com.bedrockk.behaviorpacks.definition.entity;

import lombok.Data;

@Data
public class StrengthDefinition implements EntityComponentDefinition{
	
	private int max = 5;
	private int value = 1;
}