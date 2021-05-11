package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Data;

@Data
public class MoveThroughVillageGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private boolean onlyAtNight = false;
	private double speedMultiplier = 1.0;
}