package com.bedrockk.packs.definition.entity;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
public class BreathableDefinition implements EntityComponentDefinition {
	@Singular
	private List<String> breatheBlocks;
	@Builder.Default
	private boolean breathesAir = true;
	@Builder.Default
	private boolean breathesLava = true;
	private boolean breathesSolids;
	private boolean breathesWater;
	@Builder.Default
	private boolean generatesBubbles = true;
	private double inhaleTime;
	private int suffocateTime;
	@Builder.Default
	private int totalSupply = 15;
	@Singular
	private List<String> nonBreatheBlocks;
}