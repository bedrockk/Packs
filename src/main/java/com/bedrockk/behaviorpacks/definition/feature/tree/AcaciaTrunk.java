package com.bedrockk.behaviorpacks.definition.feature.tree;

import com.bedrockk.behaviorpacks.type.BlockReference;
import com.bedrockk.behaviorpacks.type.Chance;
import com.bedrockk.behaviorpacks.type.Range;
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
    public static class Height {
        private int base;
        private List<Range> intervals;
        private Integer minHeightForCanopy;
    }

    @Data
    public static class Lean {
        private boolean allowDiagonalGrowth;
        private int leanHeight;
        private int leanSteps;
        private Integer leanLength;
    }

    @Data
    public static class Branches {
        private int branchLength;
        private int branchPosition;
        private Chance branchChance;
        private BranchCanopy branchCanopy;
    }
}