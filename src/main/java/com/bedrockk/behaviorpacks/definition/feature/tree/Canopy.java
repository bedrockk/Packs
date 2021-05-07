package com.bedrockk.behaviorpacks.definition.feature.tree;

import com.bedrockk.behaviorpacks.node.PackNode;
import com.bedrockk.behaviorpacks.type.BlockReference;
import com.bedrockk.behaviorpacks.type.ChanceInformation;
import com.bedrockk.behaviorpacks.type.JsonList;
import com.bedrockk.behaviorpacks.type.Range;
import lombok.Data;

@Data
public class Canopy {
    private Range canopyOffset;
    private Integer minWidth;
    private Slope canopySlope;
    private JsonList<ChanceInformation> variationChance;
    private BlockReference leafBlock;
    private Decoration canopyDecoration;

    @Data
    public static class Slope implements PackNode {
        private int rise;
        private int run;
    }
}