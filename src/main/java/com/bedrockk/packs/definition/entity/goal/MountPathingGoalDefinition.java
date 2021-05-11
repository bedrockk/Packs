package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Data;

@Data
public class MountPathingGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private double speedMultiplier = 1.0;
	private double targetDist = 0.0;
	private boolean trackTarget = false;
}