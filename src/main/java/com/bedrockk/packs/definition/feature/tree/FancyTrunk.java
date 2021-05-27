package com.bedrockk.packs.definition.feature.tree;

import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.BlockReference;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class FancyTrunk {
	private Height trunkHeight;
	private int trunkWidth;
	private Branches branches;
	private BlockReference trunkBlock;
	private double widthScale;
	private double foliageAltitudeFactor;

	@Data
	@Builder
	@Jacksonized
	public static class Height implements PackNode {
		private int base;
		private int variance;
		private double scale;
	}

	@Data
	@Builder
	@Jacksonized
	public static class Branches implements PackNode {
		private double slope;
		private double density;
		private double minAltitudeFactor;
	}
}