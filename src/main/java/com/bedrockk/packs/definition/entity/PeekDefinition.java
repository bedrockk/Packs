package com.bedrockk.packs.definition.entity;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class PeekDefinition implements EntityComponentDefinition {
	private EntityEventTriggerDefinition onClose;
	private EntityEventTriggerDefinition onOpen;
	private EntityEventTriggerDefinition onTargetOpen;
}