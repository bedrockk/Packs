package com.bedrockk.behaviorpacks.definition.entity.goal;

import com.bedrockk.behaviorpacks.definition.entity.EntityComponentDefinition;
import lombok.Data;

@Data
public class FollowOwnerGoalDefinition implements EntityComponentDefinition{
	private int priority;
	private double speedMultiplier = 1.0;
	private double startDistance = 10.0;
	private double stopDistance = 2.0;
}