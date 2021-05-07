package com.bedrockk.behaviorpacks.definition.entity;

import lombok.Data;

@Data
public class TickWorldDefinition implements EntityComponentDefinition{
	private double radius;
	private double distanceToPlayers = 128.0;
	private boolean neverDespawn = true;
}