package com.bedrockk.behaviorpacks.definition.entity.goal;

import com.bedrockk.behaviorpacks.definition.entity.EntityComponentDefinition;
import lombok.Data;

@Data
public class StrollTowardsVillageGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private double cooldownTime = 0.0;
	private double goalRadius = 0.5;
	private int searchRange = 0;
	private double speedMultiplier = 1.0;
	private double startChance = 0.1;
}