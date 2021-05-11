package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Data;

@Data
public class DragonDeathGoalDefinition implements EntityComponentDefinition {
	private int priority;
}