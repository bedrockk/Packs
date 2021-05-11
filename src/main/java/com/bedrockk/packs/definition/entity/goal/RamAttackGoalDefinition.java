package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import com.bedrockk.packs.definition.entity.EntityEventTriggerDefinition;
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