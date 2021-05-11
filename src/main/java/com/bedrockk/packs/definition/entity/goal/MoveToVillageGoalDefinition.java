package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Data;

@Data
public class MoveToVillageGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private double cooldownTime = 0.0;
	private double goalRadius = 0.5;
	private int searchRange = 0;
	private double speedMultiplier = 1.0;
}