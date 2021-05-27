package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
@JsonSince("1.16.0")
public class RiseToLiquidLevelGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private double liquidYOffset;
	private double riseDelta;
	private double sinkDelta;
}