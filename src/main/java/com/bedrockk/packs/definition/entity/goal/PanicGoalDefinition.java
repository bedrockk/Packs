package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import com.bedrockk.packs.type.DamageSourceType;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class PanicGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private boolean force;
	private DamageSourceType damageSources;
	private boolean ignoreMobDamage;
	private boolean preferWater;
	@Builder.Default
	private double speedMultiplier = 1.0;
}