package com.bedrockk.behaviorpacks.definition.entity.goal;

import com.bedrockk.behaviorpacks.annotation.JsonSince;
import com.bedrockk.behaviorpacks.definition.entity.EntityComponentDefinition;
import com.bedrockk.behaviorpacks.definition.entity.EntityEventTriggerDefinition;
import lombok.Data;

@Data
@JsonSince("1.16.200")
public class RamAttackGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private double runSpeed;
	private double ramSpeed;
	private double ramDistance;
	private EntityEventTriggerDefinition onStart;
}