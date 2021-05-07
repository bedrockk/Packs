package com.bedrockk.behaviorpacks.definition.entity;

import lombok.Data;

@Data
public class JumpStaticDefinition implements EntityComponentDefinition{
	
	private double jumpPower = 0.42;
}