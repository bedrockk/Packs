package com.bedrockk.behaviorpacks.definition.entity.goal;

import com.bedrockk.behaviorpacks.definition.entity.EntityComponentDefinition;
import lombok.Data;

@Data
public class SwimIdleGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private int idleTime;
	private double successRate;
}