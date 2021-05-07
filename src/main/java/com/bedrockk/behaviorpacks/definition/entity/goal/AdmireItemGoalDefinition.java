package com.bedrockk.behaviorpacks.definition.entity.goal;

import com.bedrockk.behaviorpacks.definition.entity.EntityComponentDefinition;
import com.bedrockk.behaviorpacks.definition.entity.EntityEventTriggerDefinition;
import com.bedrockk.behaviorpacks.type.Range;
import lombok.Data;

@Data
public class AdmireItemGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private String admireItemSound;
	private Range soundInterval;
	private EntityEventTriggerDefinition onAdmireItemStart;
	private EntityEventTriggerDefinition onAdmireItemStop;
}