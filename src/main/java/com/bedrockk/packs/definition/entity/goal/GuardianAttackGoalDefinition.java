package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Data;

@Data
public class GuardianAttackGoalDefinition implements EntityComponentDefinition {
	private int priority;
}