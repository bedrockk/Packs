package com.bedrockk.behaviorpacks.definition.entity.goal;

import com.bedrockk.behaviorpacks.definition.entity.EntityComponentDefinition;
import lombok.Data;

@Data
public class ExploreOutskirtsGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private double exploreDist = 5.0;
	private double speedMultiplier = 1.0;
	private int waitTime = 0;
}