package com.bedrockk.packs.definition.biome;

import com.bedrockk.packs.type.NoiseType;
import com.bedrockk.packs.type.Range;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class OverworldHeightDefinition implements BiomeComponentDefinition {
	private NoiseType noiseType;
	private Range noiseParams;
}
