package com.bedrockk.behaviorpacks.definition.entity.goal;

import com.bedrockk.behaviorpacks.definition.entity.EntityComponentDefinition;
import com.bedrockk.behaviorpacks.type.Range;
import lombok.Data;

import java.util.List;

@Data
public class TemptGoalDefinition implements EntityComponentDefinition{
	private int priority;
	private boolean canGetScared = false;
	private boolean canTemptVertically = false;
	private List<String> items;
	private double speedMultiplier = 1.0;
	private double withinRadius = 0.0;
	private String temptSound;
	private Range soundInterval;
}