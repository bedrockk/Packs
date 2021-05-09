package com.bedrockk.behaviorpacks.definition.entity.goal;

import com.bedrockk.behaviorpacks.definition.entity.EntityComponentDefinition;
import com.bedrockk.behaviorpacks.definition.entity.EntityType;
import lombok.Data;

import java.util.List;

@Data
public class ShareItemsGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private List<EntityType> entityTypes;
	private double goalRadius = 0.5;
	private double maxDist = 0.0;
	private double speedMultiplier = 1.0;
}