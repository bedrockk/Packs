package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class HoldGroundGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private boolean broadcast;
	private double broadcastRange;
	@Builder.Default
	private double minRadius = 10.0;
	private String withinRadiusEvent;
}