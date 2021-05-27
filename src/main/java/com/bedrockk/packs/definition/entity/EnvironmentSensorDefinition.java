package com.bedrockk.packs.definition.entity;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
public class EnvironmentSensorDefinition implements EntityComponentDefinition {
	@Singular
	private List<EntityEventTriggerDefinition> triggers;
}