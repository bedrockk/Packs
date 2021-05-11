package com.bedrockk.packs.definition.biome;

import com.bedrockk.packs.type.NoiseType;
import com.bedrockk.packs.type.Range;
import lombok.Data;

@Data
public class OverworldHeightDefinition implements BiomeComponentDefinition {
	private NoiseType noiseType;
	private Range noiseParams;
}
