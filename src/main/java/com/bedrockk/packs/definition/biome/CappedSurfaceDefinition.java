package com.bedrockk.packs.definition.biome;

import com.bedrockk.packs.type.BlockReference;
import lombok.Data;

import java.util.List;

@Data
public class CappedSurfaceDefinition implements BiomeComponentDefinition {
	private List<BlockReference> floorMaterials;
	private List<BlockReference> ceilingMaterials;
	private BlockReference seaMaterial;
	private BlockReference foundationMaterial;
	private BlockReference beachMaterial;
}
