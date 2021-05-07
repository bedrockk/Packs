package com.bedrockk.behaviorpacks.definition.entity.goal;

import com.bedrockk.behaviorpacks.definition.entity.EntityComponentDefinition;
import lombok.Data;

@Data
public class SwimWanderGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private double speedMultiplier;
	private int interval;
	private double lookAhead;
	private int wanderTime;
}