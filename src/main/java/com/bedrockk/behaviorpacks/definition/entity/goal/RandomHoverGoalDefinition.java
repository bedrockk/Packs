package com.bedrockk.behaviorpacks.definition.entity.goal;

import com.bedrockk.behaviorpacks.definition.entity.EntityComponentDefinition;
import com.bedrockk.behaviorpacks.type.Range;
import lombok.Data;

@Data
public class RandomHoverGoalDefinition implements EntityComponentDefinition{
	private int priority;
	private int interval = 120;
	private double speedMultiplier = 1.0;
	private int xzDist = 10;
	private int yDist = 7;
	private double yOffset = 0.0;
	private Range hoverHeight;
}