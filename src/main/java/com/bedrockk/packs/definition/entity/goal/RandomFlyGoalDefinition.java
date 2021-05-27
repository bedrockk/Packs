package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class RandomFlyGoalDefinition implements EntityComponentDefinition {
	private int priority;
	@Builder.Default
	private boolean canLandOnTrees = true;
	@Builder.Default
	private int xzDist = 10;
	@Builder.Default
	private int yDist = 7;
}