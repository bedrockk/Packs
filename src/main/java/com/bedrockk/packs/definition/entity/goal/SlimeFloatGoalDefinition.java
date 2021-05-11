package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Data;

@Data
public class SlimeFloatGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private double jumpChancePercentage;
	private double speedMultiplier;
}