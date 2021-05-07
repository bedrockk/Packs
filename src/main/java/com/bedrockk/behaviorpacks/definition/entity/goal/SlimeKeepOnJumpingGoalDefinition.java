package com.bedrockk.behaviorpacks.definition.entity.goal;

import com.bedrockk.behaviorpacks.definition.entity.EntityComponentDefinition;
import lombok.Data;

@Data
public class SlimeKeepOnJumpingGoalDefinition implements EntityComponentDefinition{
	private int priority;
	private double speedMultiplier;
}