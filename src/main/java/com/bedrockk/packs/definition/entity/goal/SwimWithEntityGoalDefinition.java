package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class SwimWithEntityGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private double successRate;
	private double chanceToStop;
	private double stateCheckInterval;
	private int catchUpThreshold;
	private int matchDirectionThreshold;
	private double catchUpMultiplier;
	private double speedMultiplier;
	private double searchRange;
	private double stopDistance;
}