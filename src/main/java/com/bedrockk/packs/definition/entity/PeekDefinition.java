package com.bedrockk.packs.definition.entity;

import lombok.Data;

@Data
public class PeekDefinition implements EntityComponentDefinition {
	private EntityEventTriggerDefinition onClose;
	private EntityEventTriggerDefinition onOpen;
	private EntityEventTriggerDefinition onTargetOpen;
}