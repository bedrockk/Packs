package com.bedrockk.packs.definition.entity;

import lombok.Data;

import java.util.List;

@Data
public class EnvironmentSensorDefinition implements EntityComponentDefinition {
	private List<EntityEventTriggerDefinition> triggers;
}