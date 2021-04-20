package com.bedrockk.behaviorpacks.definition.feature.tree;

import com.bedrockk.behaviorpacks.type.BlockReference;
import com.bedrockk.behaviorpacks.type.Pair;
import lombok.Data;

import java.util.List;

@Data
public class RandomSpreadCanopy {
    private int canopyHeight;
    private int canopyRadius;
    private int leafPlacementAttempts;
    private List<Pair<BlockReference, Double>> leafBlocks;
}