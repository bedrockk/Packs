package com.bedrockk.behaviorpacks.definition.feature.tree;

import com.bedrockk.behaviorpacks.type.BlockReference;
import com.bedrockk.behaviorpacks.type.Chance;
import com.bedrockk.behaviorpacks.type.JsonList;
import com.bedrockk.behaviorpacks.type.Range;
import lombok.Data;

@Data
public class Canopy {
    private Range canopyOffset;
    private Integer minWidth;
    private Slope canopySlope;
    private JsonList<Chance> variationChance;
    private BlockReference leafBlock;
    private Decoration canopyDecoration;

    @Data
    public static class Slope {
        private int rise;
        private int run;
    }
}