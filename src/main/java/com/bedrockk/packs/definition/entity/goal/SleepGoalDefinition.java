package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Data;

@Data
public class SleepGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private double cooldownTime = 0.0;
	private double sleepColliderHeight = 1.0;
	private double sleepColliderWidth = 1.0;
	private double sleepYOffset = 1.0;
	private double speedMultiplier = 1.0;
	private double timeoutCooldown = 8.0;
}