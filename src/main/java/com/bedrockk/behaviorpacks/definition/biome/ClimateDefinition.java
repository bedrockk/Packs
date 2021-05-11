package com.bedrockk.behaviorpacks.definition.biome;

import com.bedrockk.behaviorpacks.type.Range;
import lombok.Data;

@Data
public class ClimateDefinition implements BiomeComponentDefinition {
	private double downfall;
	private Range snowAccumulation;
	private double temperature;
	private double redSpores;
	private double blueSpores;
	private double ash;
	private double whiteAsh;
}
