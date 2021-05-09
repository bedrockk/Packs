package com.bedrockk.behaviorpacks.definition.entity;

import lombok.Data;

@Data
public class PeekDefinition implements EntityComponentDefinition {
	private EntityEventTriggerDefinition onClose;
	private EntityEventTriggerDefinition onOpen;
	private EntityEventTriggerDefinition onTargetOpen;
}