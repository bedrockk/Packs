package com.bedrockk.packs.definition.feature.tree;

import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.BlockReference;
import com.bedrockk.packs.type.ChanceInformation;
import com.bedrockk.packs.type.Range;
import lombok.Data;

import java.util.List;

@Data
public class AcaciaTrunk {
	private int trunkWidth;
	private Height trunkHeight;
	private Lean trunkLean;
	private BlockReference trunkBlock;
	private Decoration trunkDecoration;
	private Branches branches;

	@Data
	public static class Height implements PackNode {
		private int base;
		private List<Range> intervals;
		private Integer minHeightForCanopy;
	}

	@Data
	public static class Lean implements PackNode {
		private boolean allowDiagonalGrowth;
		private int leanHeight;
		private int leanSteps;
		private Integer leanLength;
	}

	@Data
	public static class Branches implements PackNode {
		private int branchLength;
		private int branchPosition;
		private ChanceInformation branchChance;
		private BranchCanopy branchCanopy;
	}
}