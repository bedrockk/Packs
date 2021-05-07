package com.bedrockk.behaviorpacks.definition.entity.goal;

import com.bedrockk.behaviorpacks.definition.entity.EntityComponentDefinition;
import com.bedrockk.behaviorpacks.definition.entity.EntityEventTriggerDefinition;
import lombok.Data;

@Data
public class GoHomeGoalDefinition implements EntityComponentDefinition{
	private int priority;
	private double goalRadius = 0.5;
	private int interval = 120;
	private EntityEventTriggerDefinition onHome;
	private EntityEventTriggerDefinition onFailed;
	private double speedMultiplier = 1.0;
}