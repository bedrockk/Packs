package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import com.bedrockk.packs.definition.entity.EntityEventTriggerDefinition;
import com.bedrockk.packs.type.Range;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class CelebrateGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private String celebrationSound;
	private Range soundInterval;
	private Range jumpInterval;
	@Builder.Default
	private double duration = 1.0;
	private EntityEventTriggerDefinition onCelebrationEndEvent;
}