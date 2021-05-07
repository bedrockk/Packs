package com.bedrockk.behaviorpacks.definition.entity;

import lombok.Data;

import java.util.List;

@Data
public class TrustingDefinition implements EntityComponentDefinition{
	private double probability = 1.0;
	private List<String> trustItems;
	private EntityEventTriggerDefinition trustEvent;
}