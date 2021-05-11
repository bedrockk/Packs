package com.bedrockk.behaviorpacks.definition.biome;

import com.bedrockk.behaviorpacks.type.NoiseType;
import com.bedrockk.behaviorpacks.type.Range;
import lombok.Data;

@Data
public class OverworldHeightDefinition implements BiomeComponentDefinition {
	private NoiseType noiseType;
	private Range noiseParams;
}
