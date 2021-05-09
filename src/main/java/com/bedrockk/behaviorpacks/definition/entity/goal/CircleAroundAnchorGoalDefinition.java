package com.bedrockk.behaviorpacks.definition.entity.goal;

import com.bedrockk.behaviorpacks.definition.entity.EntityComponentDefinition;
import com.bedrockk.behaviorpacks.type.Range;
import lombok.Data;

@Data
public class CircleAroundAnchorGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private Range radiusRange;
	private double radiusChange;
	private double radiusAdjustmentChance;
	private Range heightAboveTargetRange;
	private Range heightOffsetRange;
	private double heightOffsetChance;
	private double goalRadius;
	private double angleChange;
	private double speedMultiplier;
}