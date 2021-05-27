package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import com.bedrockk.packs.definition.entity.EntityEventTriggerDefinition;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class LayEggGoalDefinition implements EntityComponentDefinition {
	private int priority;
	@Builder.Default
	private double goalRadius = 0.5;
	private EntityEventTriggerDefinition onLay;
	@Builder.Default
	private int searchHeight = 1;
	private int searchRange;
	@Builder.Default
	private double speedMultiplier = 1.0;
}