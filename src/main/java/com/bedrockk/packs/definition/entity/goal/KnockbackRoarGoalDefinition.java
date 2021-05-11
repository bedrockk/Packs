package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.EntityFilterDefinition;
import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import com.bedrockk.packs.definition.entity.EntityEventTriggerDefinition;
import lombok.Data;

@Data
public class KnockbackRoarGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private double attackTime = 0.5;
	private double cooldownTime = 0.0;
	private double duration = 1.0;
	private int knockbackDamage = 6;
	private int knockbackRange = 4;
	private int knockbackStrength = 4;
	private EntityFilterDefinition knockbackFilters;
	private EntityFilterDefinition damageFilters;
	private EntityEventTriggerDefinition onRoarEnd;
}