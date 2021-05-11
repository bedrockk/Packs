package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import com.bedrockk.packs.type.Range;
import lombok.Data;

@Data
public class RandomLookAroundGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private Range lookTime;
}