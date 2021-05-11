package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Data;

@Data
public class RestrictOpenDoorGoalDefinition implements EntityComponentDefinition {
	private int priority;
}