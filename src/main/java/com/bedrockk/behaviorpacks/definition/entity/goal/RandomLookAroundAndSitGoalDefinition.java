package com.bedrockk.behaviorpacks.definition.entity.goal;

import com.bedrockk.behaviorpacks.definition.entity.EntityComponentDefinition;
import lombok.Data;

@Data
public class RandomLookAroundAndSitGoalDefinition implements EntityComponentDefinition{
	private int priority;
	private int maxLookCount = 2;
	private int maxLookTime = 40;
	private int minLookCount = 1;
	private int minLookTime = 20;
	private double probability = 0.02;
}