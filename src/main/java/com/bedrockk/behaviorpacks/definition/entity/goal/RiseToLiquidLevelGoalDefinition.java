package com.bedrockk.behaviorpacks.definition.entity.goal;

import com.bedrockk.behaviorpacks.annotation.JsonSince;
import com.bedrockk.behaviorpacks.definition.entity.EntityComponentDefinition;
import lombok.Data;

@Data
@JsonSince("1.16.0")
public class RiseToLiquidLevelGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private double liquidYOffset;
	private double riseDelta;
	private double sinkDelta;
}