package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Data;

@Data
public class FindCoverGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private double cooldownTime = 0.0;
	private double speedMultiplier = 1.0;
}