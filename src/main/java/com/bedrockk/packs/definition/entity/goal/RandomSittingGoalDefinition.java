package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class RandomSittingGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private double cooldownTime;
	@Builder.Default
	private double minSitTime = 10.0;
	@Builder.Default
	private double startChance = 0.1;
	@Builder.Default
	private double stopChance = 0.3;
}