package com.bedrockk.packs.definition.entity;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class RaidTriggerDefinition implements EntityComponentDefinition {
	private EntityEventTriggerDefinition triggeredEvent;
}