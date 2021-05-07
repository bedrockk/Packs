package com.bedrockk.behaviorpacks.definition.entity;

import com.bedrockk.behaviorpacks.type.ImmutableVec3;
import lombok.Data;

@Data
public class TeleportDefinition implements EntityComponentDefinition{
	
	private double darkTeleportChance = 0.01;
	private double lightTeleportChance = 0.01;
	private double maxRandomTeleportTime = 20.0;
	private double minRandomTeleportTime = 0.0;
	private boolean randomTeleports = true;
	private double targetDistance = 16.0;
	private double targetTeleportChance = 1.0;
	private ImmutableVec3 randomTeleportCube;
}