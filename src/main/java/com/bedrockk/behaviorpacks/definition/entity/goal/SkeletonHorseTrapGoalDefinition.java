package com.bedrockk.behaviorpacks.definition.entity.goal;

import com.bedrockk.behaviorpacks.definition.entity.EntityComponentDefinition;
import lombok.Data;

@Data
public class SkeletonHorseTrapGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private double duration = 1.0;
	private double withinRadius = 0.0;
}