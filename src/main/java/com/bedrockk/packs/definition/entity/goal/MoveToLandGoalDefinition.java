package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Data;

@Data
public class MoveToLandGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private double goalRadius = 0.5;
	private int searchCount = 10;
	private int searchHeight = 1;
	private int searchRange = 0;
	private double speedMultiplier = 1.0;
}