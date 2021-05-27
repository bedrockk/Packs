package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class LayDownGoalDefinition implements EntityComponentDefinition {
	private int priority;
	@Builder.Default
	private int interval = 120;
	@Builder.Default
	private int randomStopInterval = 120;
}