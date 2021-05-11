package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Data;

@Data
public class SwimIdleGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private int idleTime;
	private double successRate;
}