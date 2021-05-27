package com.bedrockk.packs.definition.biome;

import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.BlockReference;
import com.bedrockk.packs.type.Range;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
public class SurfaceMaterialAdjustmentsDefinition implements BiomeComponentDefinition {
	@Singular
	private List<Adjustment> adjustments;

	@Data
	@Builder
	@Jacksonized
	public static class Adjustment implements PackNode {
		private Materials materials;
		private Range noiseRange;
		private double noiseFrequencyScale;
	}

	@Data
	@Builder
	@Jacksonized
	public static class Materials implements PackNode {
		private BlockReference foundationMaterial;
		private BlockReference seaFloorMaterial;
		private BlockReference floorMaterial;
		private BlockReference topMaterial;
		private BlockReference midMaterial;
	}
}
