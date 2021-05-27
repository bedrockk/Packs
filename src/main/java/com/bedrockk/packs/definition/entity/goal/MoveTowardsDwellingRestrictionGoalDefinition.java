package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
@JsonSince("1.16.100")
public class MoveTowardsDwellingRestrictionGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private double speedMultiplier;
	private String controlFlags; // "move" or "look"
}