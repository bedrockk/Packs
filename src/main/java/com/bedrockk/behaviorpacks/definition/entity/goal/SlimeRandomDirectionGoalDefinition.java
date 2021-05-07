package com.bedrockk.behaviorpacks.definition.entity.goal;

import com.bedrockk.behaviorpacks.definition.entity.EntityComponentDefinition;
import lombok.Data;

@Data
public class SlimeRandomDirectionGoalDefinition implements EntityComponentDefinition{
	private int priority;
	private int addRandomTimeRange;
	private double turnRange;
	private int minChangeDirectionTime;
}