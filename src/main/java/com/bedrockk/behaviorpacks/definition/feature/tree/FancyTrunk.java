package com.bedrockk.behaviorpacks.definition.feature.tree;

import com.bedrockk.behaviorpacks.node.PackNode;
import com.bedrockk.behaviorpacks.type.BlockReference;
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