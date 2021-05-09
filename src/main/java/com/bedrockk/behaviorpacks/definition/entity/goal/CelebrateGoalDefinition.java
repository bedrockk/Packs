package com.bedrockk.behaviorpacks.definition.entity.goal;

import com.bedrockk.behaviorpacks.definition.entity.EntityComponentDefinition;
import com.bedrockk.behaviorpacks.definition.entity.EntityEventTriggerDefinition;
import com.bedrockk.behaviorpacks.type.Range;
import lombok.Data;

@Data
public class CelebrateGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private String celebrationSound;
	private Range soundInterval;
	private Range jumpInterval;
	private double duration = 1.0;
	private EntityEventTriggerDefinition onCelebrationEndEvent;
}