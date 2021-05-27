package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class RandomBreachGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private double cooldownTime;
	@Builder.Default
	private int interval = 120;
	@Builder.Default
	private double speedMultiplier = 1.0;
	@Builder.Default
	private int xzDist = 10;
	@Builder.Default
	private int yDist = 7;
}