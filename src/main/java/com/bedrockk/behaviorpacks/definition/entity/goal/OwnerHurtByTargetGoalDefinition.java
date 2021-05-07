package com.bedrockk.behaviorpacks.definition.entity.goal;

import com.bedrockk.behaviorpacks.definition.entity.EntityComponentDefinition;
import com.bedrockk.behaviorpacks.definition.entity.EntityType;
import lombok.Data;

import java.util.List;

@Data
public class OwnerHurtByTargetGoalDefinition implements EntityComponentDefinition{
	private int priority;
	private List<EntityType> entityTypes;
}