package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Data;

@Data
@JsonSince("1.16.0")
public class RiseToLiquidLevelGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private double liquidYOffset;
	private double riseDelta;
	private double sinkDelta;
}