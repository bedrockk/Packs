package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Data;

@Data
public class OpenDoorGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private boolean closeDoorAfter = true;
}