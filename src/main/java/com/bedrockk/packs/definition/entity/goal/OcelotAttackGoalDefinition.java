package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Data;

@Data
public class OcelotAttackGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private double sneakSpeedMultiplier;
	private double sprintSpeedMultiplier;
	private double walkSpeedMultiplier;
	private int cooldownTime;
	private double yMaxRotation;
	private double yMaxHeadRotation;
	private double maxDistance;
	private double maxSneakRange;
	private double maxSprintRange;
	private double reachMultiplier;
}