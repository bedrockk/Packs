package com.bedrockk.packs.definition.entity;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class RailMovementDefinition implements EntityComponentDefinition {
	@Builder.Default
	private double maxSpeed = 0.4;
}