package com.bedrockk.behaviorpacks.definition.biome;

import com.bedrockk.behaviorpacks.annotation.JsonSince;
import com.bedrockk.behaviorpacks.node.PackNode;
import com.bedrockk.behaviorpacks.type.BlockReference;
import lombok.Data;

@Data
@JsonSince("1.16.210")
public class MountainParametersDefinition implements BiomeComponentDefinition {
	private TopSlide topSlide;
	private MaterialAdjustment steepMaterialAdjustment;

	@Data
	public static class TopSlide implements PackNode {
		private boolean enabled;
	}

	@Data
	public static class MaterialAdjustment implements PackNode {
		private BlockReference material;
		private boolean northSlopes;
		private boolean southSlopes;
		private boolean eastSlopes;
		private boolean westSlopes;
	}
}
