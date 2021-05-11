package com.bedrockk.behaviorpacks.definition.biome;

import com.bedrockk.behaviorpacks.type.BlockReference;
import lombok.Data;

@Data
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
