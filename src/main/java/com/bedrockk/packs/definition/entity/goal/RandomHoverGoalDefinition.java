package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import com.bedrockk.packs.type.Range;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class RandomHoverGoalDefinition implements EntityComponentDefinition {
	private int priority;
	@Builder.Default
	private int interval = 120;
	@Builder.Default
	private double speedMultiplier = 1.0;
	@Builder.Default
	private int xzDist = 10;
	@Builder.Default
	private int yDist = 7;
	private double yOffset;
	private Range hoverHeight;
}