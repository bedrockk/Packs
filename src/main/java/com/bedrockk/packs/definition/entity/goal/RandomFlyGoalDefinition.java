package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Data;

@Data
public class RandomFlyGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private boolean canLandOnTrees = true;
	private int xzDist = 10;
	private int yDist = 7;
}