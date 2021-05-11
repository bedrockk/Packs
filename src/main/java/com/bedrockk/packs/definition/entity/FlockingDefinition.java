package com.bedrockk.packs.definition.entity;

import lombok.Data;

@Data
public class FlockingDefinition implements EntityComponentDefinition {

	private double blockDistance = 0.0;
	private double blockWeight = 0.0;
	private double breachInfluence = 0.0;
	private double cohesionThreshold = 1.0;
	private double cohesionWeight = 1.0;
	private double goalWeight = 0.0;
	private int highFlockLimit = 0;
	private boolean inWater = false;
	private double influenceRadius = 0.0;
	private double innnerCohesionThreshold = 0.0;
	private double lonerChance = 0.0;
	private int lowFlockLimit = 0;
	private boolean matchVariants = false;
	private double maxHeight = 0.0;
	private double minHeight = 0.0;
	private double separationThreshold = 2.0;
	private double separationWeight = 1.0;
	private boolean useCenterOfMass = false;
}