package com.bedrockk.packs.definition.entity;

import lombok.Data;

@Data
public class RaidTriggerDefinition implements EntityComponentDefinition {
	private EntityEventTriggerDefinition triggeredEvent;
}