package com.bedrockk.behaviorpacks.definition.biome;

import com.bedrockk.behaviorpacks.annotation.JsonUntil;
import lombok.Data;

@Data
@JsonUntil("1.16.220")
public class NetherGenerationRulesDefinition implements BiomeComponentDefinition {
	private double targetTemperature;
	private double targetHumidity;
	private double targetAltitude;
	private double targetWeirdness;
	private double weight;
}
