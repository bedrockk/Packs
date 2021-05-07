package com.bedrockk.behaviorpacks.definition.entity.goal;

import com.bedrockk.behaviorpacks.definition.entity.EntityComponentDefinition;
import lombok.Data;

@Data
public class MoveTowardsTargetGoalDefinition implements EntityComponentDefinition{
	private int priority;
	private double withinRadius = 0.0;
}