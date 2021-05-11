package com.bedrockk.behaviorpacks.definition.biome;

import com.bedrockk.behaviorpacks.type.BlockReference;
import lombok.Data;

@Data
public class MesaSurfaceDefinition extends SurfaceParametersDefinition {
	private BlockReference clayMaterial;
	private BlockReference hardClayMaterial;
	private boolean brycePillars;
	private boolean hasForest;
}
