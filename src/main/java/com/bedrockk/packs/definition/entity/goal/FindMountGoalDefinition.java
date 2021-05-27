package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class FindMountGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private boolean avoidWater;
	private double mountDistance;
	private int startDelay;
	private boolean targetNeeded;
	private double withinRadius;
}