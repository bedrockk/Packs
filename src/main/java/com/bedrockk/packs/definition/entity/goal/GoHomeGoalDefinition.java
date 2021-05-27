package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import com.bedrockk.packs.definition.entity.EntityEventTriggerDefinition;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class GoHomeGoalDefinition implements EntityComponentDefinition {
	private int priority;
	@Builder.Default
	private double goalRadius = 0.5;
	@Builder.Default
	private int interval = 120;
	private EntityEventTriggerDefinition onHome;
	private EntityEventTriggerDefinition onFailed;
	@Builder.Default
	private double speedMultiplier = 1.0;
}