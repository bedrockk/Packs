package com.bedrockk.behaviorpacks.definition.entity.goal;

import com.bedrockk.behaviorpacks.definition.entity.EntityComponentDefinition;
import lombok.Data;

@Data
public class LeapAtTargetGoalDefinition implements EntityComponentDefinition{
	private int priority;
	private boolean mustBeOnGround = true;
	private boolean setPersistent = false;
	private double yd = 0.0;
}