package com.bedrockk.packs.definition.feature.tree;

import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.BlockReference;
import lombok.Data;

@Data
public class FancyTrunk {
	private Height trunkHeight;
	private int trunkWidth;
	private Branches branches;
	private BlockReference trunkBlock;
	private double widthScale;
	private double foliageAltitudeFactor;

	@Data
	public static class Height implements PackNode {
		private int base;
		private int variance;
		private double scale;
	}

	@Data
	public static class Branches implements PackNode {
		private double slope;
		private double density;
		private double minAltitudeFactor;
	}
}