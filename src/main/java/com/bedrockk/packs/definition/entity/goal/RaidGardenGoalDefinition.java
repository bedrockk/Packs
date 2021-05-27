package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
public class RaidGardenGoalDefinition implements EntityComponentDefinition {
	private int priority;
	@Singular
	private List<String> blocks;
	@Builder.Default
	private int eatDelay = 2;
	@Builder.Default
	private int fullDelay = 100;
	@Builder.Default
	private double goalRadius = 0.5;
	private int initialEatDelay;
	@Builder.Default
	private int maxToEat = 6;
	private int searchRange;
	@Builder.Default
	private double speedMultiplier = 1.0;
}