package com.bedrockk.behaviorpacks.definition.entity.goal;

import com.bedrockk.behaviorpacks.definition.entity.EntityComponentDefinition;
import com.bedrockk.behaviorpacks.type.Range;
import lombok.Data;

@Data
public class FloatWanderGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private Range floatDuration;
	private boolean mustReach = false;
	private boolean randomReselect = false;
	private int xzDist = 10;
	private int yDist = 7;
	private double yOffset = 0.0;
}