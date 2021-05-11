package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import com.bedrockk.packs.definition.entity.EntityEventTriggerDefinition;
import lombok.Data;

@Data
public class DefendTrustedTargetGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private String aggroSound;
	private double attackChance;
	private double withinRadius;
	private boolean mustSee;
	private double soundChance;
	private EntityEventTriggerDefinition onDefendStart;
}