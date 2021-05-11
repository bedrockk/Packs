package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Data;

@Data
public class ScaredGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private int soundInterval;
}