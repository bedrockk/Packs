package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Data;

@Data
public class MoveTowardsRestrictionGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private double speedMultiplier;
	private String controlFlags; // "move" or "look"
}