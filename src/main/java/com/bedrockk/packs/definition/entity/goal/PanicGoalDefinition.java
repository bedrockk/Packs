package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import com.bedrockk.packs.type.DamageSourceType;
import lombok.Data;

@Data
public class PanicGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private boolean force = false;
	private DamageSourceType damageSources;
	private boolean ignoreMobDamage = false;
	private boolean preferWater = false;
	private double speedMultiplier = 1.0;
}