package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Data;

@Data
public class SwellGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private double startDistance = 10.0;
	private double stopDistance = 2.0;
}