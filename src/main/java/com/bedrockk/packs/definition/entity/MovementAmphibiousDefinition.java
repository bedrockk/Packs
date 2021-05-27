package com.bedrockk.packs.definition.entity;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class MovementAmphibiousDefinition implements EntityComponentDefinition {
	@Builder.Default
	private double maxTurn = 30.0;
}