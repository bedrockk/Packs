package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class StrollTowardsVillageGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private double cooldownTime;
	@Builder.Default
	private double goalRadius = 0.5;
	private int searchRange;
	@Builder.Default
	private double speedMultiplier = 1.0;
	@Builder.Default
	private double startChance = 0.1;
}