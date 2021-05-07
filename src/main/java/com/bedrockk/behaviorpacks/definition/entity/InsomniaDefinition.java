package com.bedrockk.behaviorpacks.definition.entity;

import lombok.Data;

@Data
public class InsomniaDefinition implements EntityComponentDefinition{
	
	private double daysUntilInsomnia = 3.0;
}