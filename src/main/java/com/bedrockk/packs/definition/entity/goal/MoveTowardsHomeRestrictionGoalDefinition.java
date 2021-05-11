package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Data;

@Data
@JsonSince("1.16.100")
public class MoveTowardsHomeRestrictionGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private double speedMultiplier;
	private String controlFlags; // "move" or "look"
}