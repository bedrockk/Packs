package com.bedrockk.packs.definition.entity;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class TickWorldDefinition implements EntityComponentDefinition {
	private double radius;
	@Builder.Default
	private double distanceToPlayers = 128.0;
	@Builder.Default
	private boolean neverDespawn = true;
}