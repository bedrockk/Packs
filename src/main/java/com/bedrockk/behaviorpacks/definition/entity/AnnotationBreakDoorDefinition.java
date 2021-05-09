package com.bedrockk.behaviorpacks.definition.entity;

import lombok.Data;

@Data
public class AnnotationBreakDoorDefinition implements EntityComponentDefinition {
	private double breakTime = 12.0;
	private String minDifficulty = "hard";
}