package com.bedrockk.packs.definition.biome;

import com.bedrockk.packs.type.BlockReference;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@Data
@SuperBuilder
@Jacksonized
public class MesaSurfaceDefinition extends SurfaceParametersDefinition {
	private BlockReference clayMaterial;
	private BlockReference hardClayMaterial;
	private boolean brycePillars;
	private boolean hasForest;
}
