package com.bedrockk.behaviorpacks.definition.entity.goal;

import com.bedrockk.behaviorpacks.definition.entity.EntityComponentDefinition;
import com.bedrockk.behaviorpacks.definition.entity.EntityType;
import lombok.Data;

import java.util.List;

@Data
public class FollowCaravanGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private int entityCount = 1;
	private List<EntityType> entityTypes;
	private double speedMultiplier = 1.0;
}