package com.bedrockk.packs.definition.entity;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@Data
@SuperBuilder
@Jacksonized
public class WaterMovementDefinition extends MovementDefinition {

	@Builder.Default
	private double dragFactor = 0.8;
}