package com.bedrockk.behaviorpacks.definition.entity.goal;

import com.bedrockk.behaviorpacks.definition.entity.EntityComponentDefinition;
import lombok.Data;

@Data
public class FindMountGoalDefinition implements EntityComponentDefinition{
	private int priority;
	private boolean avoidWater = false;
	private double mountDistance;
	private int startDelay = 0;
	private boolean targetNeeded = false;
	private double withinRadius = 0.0;
}