package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class RandomLookAroundAndSitGoalDefinition implements EntityComponentDefinition {
	private int priority;
	@Builder.Default
	private int maxLookCount = 2;
	@Builder.Default
	private int maxLookTime = 40;
	@Builder.Default
	private int minLookCount = 1;
	@Builder.Default
	private int minLookTime = 20;
	@Builder.Default
	private double probability = 0.02;
}