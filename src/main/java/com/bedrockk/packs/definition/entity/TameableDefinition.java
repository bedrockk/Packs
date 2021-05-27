package com.bedrockk.packs.definition.entity;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
public class TameableDefinition implements EntityComponentDefinition {
	@Builder.Default
	private double probability = 1.0;
	@Singular
	private List<String> tameItems;
	private EntityEventTriggerDefinition tameEvent;
}