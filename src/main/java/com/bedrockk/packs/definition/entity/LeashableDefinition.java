package com.bedrockk.packs.definition.entity;

import lombok.Data;

@Data
public class LeashableDefinition implements EntityComponentDefinition {

	private boolean canBeStolen = false;
	private double hardDistance = 6.0;
	private double maxDistance = 10.0;
	private EntityEventTriggerDefinition onLeash;
	private EntityEventTriggerDefinition onUnleash;
	private double softDistance = 4.0;
}