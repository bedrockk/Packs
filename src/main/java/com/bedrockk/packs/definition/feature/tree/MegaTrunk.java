package com.bedrockk.packs.definition.feature.tree;

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
public class MegaTrunk {
	private int trunkWidth;
	private Height trunkHeight;
	private BlockReference trunkBlock;
	private Decoration trunkDecoration;
	private Branches branches;

	@Data
	@Builder
	@Jacksonized
	public static class Height implements PackNode {
		private int base;
		@Singular
		private List<Range> intervals;
	}

	@Data
	@Builder
	@Jacksonized
	public static class Branches {
		private int branchLength;
		private double branchSlope;
		private Range branchInterval;
		private Range branchAltitudeFactor;
		private BranchCanopy branchCanopy;
	}
}