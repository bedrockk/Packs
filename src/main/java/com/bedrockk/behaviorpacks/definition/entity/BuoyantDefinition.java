package com.bedrockk.behaviorpacks.definition.entity;

import com.bedrockk.behaviorpacks.annotation.JsonSince;
import lombok.Data;

import java.util.List;

@Data
@JsonSince("1.16.0")
public class BuoyantDefinition implements EntityComponentDefinition{
	private boolean applyGravity = true;
	private double baseBuoyancy = 1.0;
	private double bigWaveProbability = 0.03;
	private double bigWaveSpeed = 10.0;
	private double dragDownOnBuoyancyRemoved = 0.0;
	private boolean simulateWaves = true;
	private List<String> liquidBlocks;
}