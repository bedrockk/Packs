package com.bedrockk.packs.definition.biome;

import com.bedrockk.packs.type.BlockReference;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@Data
@SuperBuilder
@Jacksonized
public class SurfaceParametersDefinition implements BiomeComponentDefinition {
	private int seaFloorDepth;
	private BlockReference seaFloorMaterial;
	private BlockReference seaMaterial;
	private int floorDepth;
	private BlockReference floorMaterial;
	private BlockReference foundationMaterial;
	private BlockReference midMaterial;
	private BlockReference topMaterial;
}
