package com.bedrockk.packs.definition.entity;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class LeashableDefinition implements EntityComponentDefinition {

	private boolean canBeStolen;
	@Builder.Default
	private double hardDistance = 6.0;
	@Builder.Default
	private double maxDistance = 10.0;
	private EntityEventTriggerDefinition onLeash;
	private EntityEventTriggerDefinition onUnleash;
	@Builder.Default
	private double softDistance = 4.0;
}