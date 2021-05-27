package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.type.ImmutableVec3;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class TeleportDefinition implements EntityComponentDefinition {
	@Builder.Default
	private double darkTeleportChance = 0.01;
	@Builder.Default
	private double lightTeleportChance = 0.01;
	@Builder.Default
	private double maxRandomTeleportTime = 20.0;
	private double minRandomTeleportTime;
	@Builder.Default
	private boolean randomTeleports = true;
	@Builder.Default
	private double targetDistance = 16.0;
	@Builder.Default
	private double targetTeleportChance = 1.0;
	private ImmutableVec3 randomTeleportCube;
}