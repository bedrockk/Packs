package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class RollGoalDefinition implements EntityComponentDefinition {
	private int priority;
	@Builder.Default
	private double probability = 1.0;
}