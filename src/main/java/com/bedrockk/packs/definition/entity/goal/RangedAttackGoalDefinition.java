package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
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