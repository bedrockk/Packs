package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class MoveToRandomBlockGoalDefinition implements EntityComponentDefinition {
	private int priority;
	@Builder.Default
	private double blockDistance = 16.0;
	private double withinRadius;
}