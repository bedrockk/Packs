package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.annotation.JsonSince;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
@JsonSince("1.16.0")
public class BuoyantDefinition implements EntityComponentDefinition {
	@Builder.Default
	private boolean applyGravity = true;
	@Builder.Default
	private double baseBuoyancy = 1.0;
	@Builder.Default
	private double bigWaveProbability = 0.03;
	@Builder.Default
	private double bigWaveSpeed = 10.0;
	private double dragDownOnBuoyancyRemoved;
	@Builder.Default
	private boolean simulateWaves = true;
	@Singular
	private List<String> liquidBlocks;
}