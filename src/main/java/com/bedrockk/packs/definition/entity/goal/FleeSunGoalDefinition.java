package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Data;

@Data
public class FleeSunGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private double speedMultiplier = 1.0;
}