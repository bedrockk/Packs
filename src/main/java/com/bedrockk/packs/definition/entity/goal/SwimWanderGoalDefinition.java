package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Data;

@Data
public class SwimWanderGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private double speedMultiplier;
	private int interval;
	private double lookAhead;
	private int wanderTime;
}