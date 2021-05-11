package com.bedrockk.packs.definition.biome;

import com.bedrockk.packs.annotation.JsonSince;
import lombok.Data;

@Data
@JsonSince("1.16.220")
public class MultiNoiseGenerationRulesDefinition implements BiomeComponentDefinition {
	private double targetTemperature;
	private double targetHumidity;
	private double targetAltitude;
	private double targetWeirdness;
	private double weight;
}
