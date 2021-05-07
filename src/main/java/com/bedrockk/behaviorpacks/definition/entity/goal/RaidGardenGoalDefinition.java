package com.bedrockk.behaviorpacks.definition.entity.goal;

import com.bedrockk.behaviorpacks.definition.entity.EntityComponentDefinition;
import lombok.Data;

import java.util.List;

@Data
public class RaidGardenGoalDefinition implements EntityComponentDefinition{
	private int priority;
	private List<String> blocks;
	private int eatDelay = 2;
	private int fullDelay = 100;
	private double goalRadius = 0.5;
	private int initialEatDelay = 0;
	private int maxToEat = 6;
	private int searchRange = 0;
	private double speedMultiplier = 1.0;
}