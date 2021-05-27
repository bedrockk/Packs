package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.EntityFilterDefinition;
import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import com.bedrockk.packs.definition.entity.EntityEventTriggerDefinition;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class KnockbackRoarGoalDefinition implements EntityComponentDefinition {
	private int priority;
	@Builder.Default
	private double attackTime = 0.5;
	private double cooldownTime;
	@Builder.Default
	private double duration = 1.0;
	@Builder.Default
	private int knockbackDamage = 6;
	@Builder.Default
	private int knockbackRange = 4;
	@Builder.Default
	private int knockbackStrength = 4;
	private EntityFilterDefinition knockbackFilters;
	private EntityFilterDefinition damageFilters;
	private EntityEventTriggerDefinition onRoarEnd;
}