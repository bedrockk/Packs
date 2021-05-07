package com.bedrockk.behaviorpacks.definition.entity.goal;

import com.bedrockk.behaviorpacks.definition.entity.EntityComponentDefinition;
import lombok.Data;

@Data
public class RandomSwimGoalDefinition implements EntityComponentDefinition{
	private int priority;
	private boolean avoidSurface = true;
	private int interval = 120;
	private double speedMultiplier = 1.0;
	private int xzDist = 10;
	private int yDist = 7;
}