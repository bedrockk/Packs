package com.bedrockk.packs.definition.biome;

import com.bedrockk.packs.type.Range;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class ClimateDefinition implements BiomeComponentDefinition {
	private double downfall;
	private Range snowAccumulation;
	private double temperature;
	private double redSpores;
	private double blueSpores;
	private double ash;
	private double whiteAsh;
}
