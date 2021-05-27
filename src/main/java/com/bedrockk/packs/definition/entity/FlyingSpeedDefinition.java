package com.bedrockk.packs.definition.entity;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class FlyingSpeedDefinition implements EntityComponentDefinition {
	@Builder.Default
	private double value = 0.02;
}
