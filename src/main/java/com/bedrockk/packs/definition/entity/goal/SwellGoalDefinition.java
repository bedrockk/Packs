package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class SwellGoalDefinition implements EntityComponentDefinition {
	private int priority;
	@Builder.Default
	private double startDistance = 10.0;
	@Builder.Default
	private double stopDistance = 2.0;
}