package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import com.bedrockk.packs.type.Range;
import lombok.Data;

@Data
public class SwoopAttackGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private double damageReach;
	private double speedMultiplier;
	private Range delayRange;
}