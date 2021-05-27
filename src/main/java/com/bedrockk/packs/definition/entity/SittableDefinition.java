package com.bedrockk.packs.definition.entity;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class SittableDefinition implements EntityComponentDefinition {
	private EntityEventTriggerDefinition sitEvent;
	private EntityEventTriggerDefinition standEvent;
}