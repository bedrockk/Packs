package com.bedrockk.behaviorpacks.definition.entity;

import lombok.Data;

@Data
public class CollisionBoxDefinition implements EntityComponentDefinition {
	private double height = 1.0;
	private double width = 1.0;
}
