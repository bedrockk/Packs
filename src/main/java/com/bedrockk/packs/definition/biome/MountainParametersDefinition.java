package com.bedrockk.packs.definition.biome;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.BlockReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
@JsonSince("1.16.210")
public class MountainParametersDefinition implements BiomeComponentDefinition {
	private TopSlide topSlide;
	private MaterialAdjustment steepMaterialAdjustment;

	@Data
	@NoArgsConstructor
	@AllArgsConstructor(staticName = "of")
	public static class TopSlide implements PackNode {
		private boolean enabled;
	}

	@Data
	@Builder
	@Jacksonized
	public static class MaterialAdjustment implements PackNode {
		private BlockReference material;
		private boolean northSlopes;
		private boolean southSlopes;
		private boolean eastSlopes;
		private boolean westSlopes;
	}
}
