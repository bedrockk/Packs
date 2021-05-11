package com.bedrockk.packs.definition.entity;

import lombok.Data;

import java.util.List;

@Data
public class TameableDefinition implements EntityComponentDefinition {
	private double probability = 1.0;
	private List<String> tameItems;
	private EntityEventTriggerDefinition tameEvent;
}