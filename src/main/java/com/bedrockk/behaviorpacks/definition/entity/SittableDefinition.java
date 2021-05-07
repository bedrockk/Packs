package com.bedrockk.behaviorpacks.definition.entity;

import lombok.Data;

@Data
public class SittableDefinition implements EntityComponentDefinition{
	private EntityEventTriggerDefinition sitEvent;
	private EntityEventTriggerDefinition standEvent;
}