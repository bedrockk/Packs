package com.bedrockk.packs.definition.biome;

import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.BlockReference;
import com.bedrockk.packs.type.Range;
import lombok.Data;

import java.util.List;

@Data
public class SurfaceMaterialAdjustmentsDefinition implements BiomeComponentDefinition {
	private List<Adjustment> adjustments;

	@Data
	public static class Adjustment implements PackNode {
		private Materials materials;
		private Range noiseRange;
		private double noiseFrequencyScale;
	}

	@Data
	public static class Materials implements PackNode {
		private BlockReference foundationMaterial;
		private BlockReference seaFloorMaterial;
		private BlockReference floorMaterial;
		private BlockReference topMaterial;
		private BlockReference midMaterial;
	}
}
