package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import com.bedrockk.packs.type.Range;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class FloatWanderGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private Range floatDuration;
	private boolean mustReach;
	private boolean randomReselect;
	@Builder.Default
	private int xzDist = 10;
	@Builder.Default
	private int yDist = 7;
	private double yOffset;
}