package com.bedrockk.behaviorpacks.definition.entity.goal;

import com.bedrockk.behaviorpacks.definition.entity.EntityComponentDefinition;
import com.bedrockk.behaviorpacks.definition.entity.EntityEventTriggerDefinition;
import lombok.Data;

@Data
public class WorkGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private double speedMultiplier;
	private int goalCooldown;
	private int soundDelayMin;
	private int soundDelayMax;
	private int activeTime;
	private boolean canWorkInRain;
	private int workInRainTolerance;
	private EntityEventTriggerDefinition onArrival;
}