package com.bedrockk.behaviorpacks.definition.entity;

import lombok.Data;

@Data
public class AdmireItemDefinition implements EntityComponentDefinition{
	
	private int cooldownAfterBeingAttacked = 0;
	private int duration = 10;
}