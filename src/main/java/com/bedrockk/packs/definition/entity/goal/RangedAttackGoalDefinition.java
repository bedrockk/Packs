package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Data;

@Data
public class RangedAttackGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private int attackIntervalMax;
	private int attackIntervalMin;
	private double attackRadius;
	private double burstInterval;
	private int burstShots;
	private double chargeChargedTrigger;
	private double chargeShootTrigger;
	private double rangedFov;
	private double speedMultiplier;
	private double targetInSightTime;
}