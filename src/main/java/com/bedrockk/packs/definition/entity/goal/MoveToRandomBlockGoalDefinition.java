package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Data;

@Data
public class MoveToRandomBlockGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private double blockDistance = 16.0;
	private double withinRadius = 0.0;
}