package com.bedrockk.packs.definition.biome;

import com.bedrockk.packs.annotation.JsonUntil;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
@JsonUntil("1.16.220")
public class NetherGenerationRulesDefinition implements BiomeComponentDefinition {
	private double targetTemperature;
	private double targetHumidity;
	private double targetAltitude;
	private double targetWeirdness;
	private double weight;
}
