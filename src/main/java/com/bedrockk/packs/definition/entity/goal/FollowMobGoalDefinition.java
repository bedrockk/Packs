package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Data;

@Data
public class FollowMobGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private int searchRange = 0;
	private double speedMultiplier = 1.0;
	private double stopDistance = 2.0;
}