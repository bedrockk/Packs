package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class RandomSwimGoalDefinition implements EntityComponentDefinition {
	private int priority;
	@Builder.Default
	private boolean avoidSurface = true;
	@Builder.Default
	private int interval = 120;
	@Builder.Default
	private double speedMultiplier = 1.0;
	@Builder.Default
	private int xzDist = 10;
	@Builder.Default
	private int yDist = 7;
}