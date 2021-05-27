package com.bedrockk.packs.definition.entity;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class FlockingDefinition implements EntityComponentDefinition {

	private double blockDistance;
	private double blockWeight;
	private double breachInfluence;
	@Builder.Default
	private double cohesionThreshold = 1.0;
	@Builder.Default
	private double cohesionWeight = 1.0;
	private double goalWeight;
	private int highFlockLimit;
	private boolean inWater;
	private double influenceRadius;
	private double innnerCohesionThreshold;
	private double lonerChance;
	private int lowFlockLimit;
	private boolean matchVariants;
	private double maxHeight;
	private double minHeight;
	@Builder.Default
	private double separationThreshold = 2.0;
	@Builder.Default
	private double separationWeight = 1.0;
	private boolean useCenterOfMass;
}