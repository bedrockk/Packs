package com.bedrockk.behaviorpacks.definition.entity.goal;

import com.bedrockk.behaviorpacks.annotation.JsonSince;
import com.bedrockk.behaviorpacks.definition.entity.EntityComponentDefinition;
import lombok.Data;

@Data
@JsonSince("1.16.100")
public class MoveTowardsDwellingRestrictionGoalDefinition implements EntityComponentDefinition{
	private int priority;
	private double speedMultiplier;
	private String controlFlags; // "move" or "look"
}