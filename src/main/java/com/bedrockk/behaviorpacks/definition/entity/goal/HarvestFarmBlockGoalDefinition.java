package com.bedrockk.behaviorpacks.definition.entity.goal;

import com.bedrockk.behaviorpacks.definition.entity.EntityComponentDefinition;
import lombok.Data;

@Data
public class HarvestFarmBlockGoalDefinition implements EntityComponentDefinition{
	private int priority;
	private double speedMultiplier;
}