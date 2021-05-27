package com.bedrockk.packs.definition.entity;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class MovementGlideDefinition implements EntityComponentDefinition {
	private double value;
	@Builder.Default
	private double maxTurn = 30.0;
	private double startSpeed;
	private double speedWhenTurning;
}