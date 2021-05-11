package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import com.bedrockk.packs.definition.entity.EntityEventTriggerDefinition;
import com.bedrockk.packs.type.Range;
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