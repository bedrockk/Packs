package com.bedrockk.behaviorpacks.definition.entity.goal;

import com.bedrockk.behaviorpacks.definition.entity.EntityComponentDefinition;
import lombok.Data;

@Data
public class RandomSittingGoalDefinition implements EntityComponentDefinition{
	private int priority;
	private double cooldownTime = 0.0;
	private double minSitTime = 10.0;
	private double startChance = 0.1;
	private double stopChance = 0.3;
}