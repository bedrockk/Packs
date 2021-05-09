package com.bedrockk.behaviorpacks.definition.entity.goal;

import com.bedrockk.behaviorpacks.definition.entity.EntityComponentDefinition;
import com.bedrockk.behaviorpacks.type.DamageSourceType;
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