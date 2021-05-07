package com.bedrockk.behaviorpacks.definition.entity.goal;

import com.bedrockk.behaviorpacks.definition.entity.EntityComponentDefinition;
import lombok.Data;

@Data
public class SlimeFloatGoalDefinition implements EntityComponentDefinition{
	private int priority;
	private double jumpChancePercentage;
	private double speedMultiplier;
}