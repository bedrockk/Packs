package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class MoveToLavaGoalDefinition implements EntityComponentDefinition {
	private int priority;
	@Builder.Default
	private double goalRadius = 0.5;
	@Builder.Default
	private int searchCount = 10;
	@Builder.Default
	private int searchHeight = 1;
	private int searchRange;
	@Builder.Default
	private double speedMultiplier = 1.0;
}