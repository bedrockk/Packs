package com.bedrockk.packs.definition.biome;

import com.bedrockk.packs.type.BlockReference;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
public class CappedSurfaceDefinition implements BiomeComponentDefinition {
	@Singular
	private List<BlockReference> floorMaterials;
	@Singular
	private List<BlockReference> ceilingMaterials;
	private BlockReference seaMaterial;
	private BlockReference foundationMaterial;
	private BlockReference beachMaterial;
}
