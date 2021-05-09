package com.bedrockk.behaviorpacks.definition.feature.tree;

import com.bedrockk.behaviorpacks.node.PackNode;
import com.bedrockk.behaviorpacks.type.BlockReference;
import com.bedrockk.behaviorpacks.type.Range;
import lombok.Data;

import java.util.List;

@Data
public class MegaTrunk {
	private int trunkWidth;
	private Height trunkHeight;
	private BlockReference trunkBlock;
	private Decoration trunkDecoration;
	private Branches branches;

	@Data
	public static class Height implements PackNode {
		private int base;
		private List<Range> intervals;
	}

	@Data
	public static class Branches {
		private int branchLength;
		private double branchSlope;
		private Range branchInterval;
		private Range branchAltitudeFactor;
		private BranchCanopy branchCanopy;
	}
}