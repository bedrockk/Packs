package com.bedrockk.behaviorpacks.definition.entity.goal;

import com.bedrockk.behaviorpacks.definition.entity.EntityComponentDefinition;
import lombok.Data;

@Data
public class LayDownGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private int interval = 120;
	private int randomStopInterval = 120;
}