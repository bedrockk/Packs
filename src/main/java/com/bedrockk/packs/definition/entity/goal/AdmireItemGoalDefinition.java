package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import com.bedrockk.packs.definition.entity.EntityEventTriggerDefinition;
import com.bedrockk.packs.type.Range;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class AdmireItemGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private String admireItemSound;
	private Range soundInterval;
	private EntityEventTriggerDefinition onAdmireItemStart;
	private EntityEventTriggerDefinition onAdmireItemStop;
}