package com.bedrockk.behaviorpacks.definition.entity.goal;

import com.bedrockk.behaviorpacks.definition.entity.EntityComponentDefinition;
import com.bedrockk.behaviorpacks.definition.entity.EntityType;
import lombok.Data;

import java.util.List;

@Data
public class HurtByTargetGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private boolean alertSameType = false;
	private List<EntityType> entityTypes;
	private boolean hurtOwner = false;
}