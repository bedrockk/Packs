package com.bedrockk.behaviorpacks.definition.entity;

import lombok.Data;

@Data
public class ScaleByAgeDefinition implements EntityComponentDefinition {

	private double endScale = 1.0;
	private double startScale = 1.0;
}