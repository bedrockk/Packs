package com.bedrockk.behaviorpacks.definition.entity.goal;

import com.bedrockk.behaviorpacks.definition.entity.EntityComponentDefinition;
import com.bedrockk.behaviorpacks.definition.entity.EntityEventTriggerDefinition;
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