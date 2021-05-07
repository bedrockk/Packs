package com.bedrockk.behaviorpacks.definition.entity;

import lombok.Data;

@Data
public class RaidTriggerDefinition implements EntityComponentDefinition{
	private EntityEventTriggerDefinition triggeredEvent;
}