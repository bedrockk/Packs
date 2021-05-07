package com.bedrockk.behaviorpacks.definition.entity.goal;

import com.bedrockk.behaviorpacks.definition.entity.EntityComponentDefinition;
import lombok.Data;

@Data
public class StayWhileSittingGoalDefinition implements EntityComponentDefinition{
	private int priority;
}