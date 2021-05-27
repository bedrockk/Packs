package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class TradeInterestGoalDefinition implements EntityComponentDefinition {
	private int priority;
	@Builder.Default
	private double carriedItemSwitchTime = 2.0;
	@Builder.Default
	private double cooldown = 2.0;
	@Builder.Default
	private double interestTime = 45.0;
	@Builder.Default
	private double removeItemTime = 1.0;
	private double withinRadius;
}