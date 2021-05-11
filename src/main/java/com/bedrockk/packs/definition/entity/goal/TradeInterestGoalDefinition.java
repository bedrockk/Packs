package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Data;

@Data
public class TradeInterestGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private double carriedItemSwitchTime = 2.0;
	private double cooldown = 2.0;
	private double interestTime = 45.0;
	private double removeItemTime = 1.0;
	private double withinRadius = 0.0;
}