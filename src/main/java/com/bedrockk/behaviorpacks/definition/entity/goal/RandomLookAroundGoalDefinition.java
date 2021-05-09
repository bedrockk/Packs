package com.bedrockk.behaviorpacks.definition.entity.goal;

import com.bedrockk.behaviorpacks.definition.entity.EntityComponentDefinition;
import com.bedrockk.behaviorpacks.type.Range;
import lombok.Data;

@Data
public class RandomLookAroundGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private Range lookTime;
}