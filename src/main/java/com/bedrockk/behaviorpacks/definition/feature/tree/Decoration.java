package com.bedrockk.behaviorpacks.definition.feature.tree;

import com.bedrockk.behaviorpacks.type.BlockReference;
import com.bedrockk.behaviorpacks.type.Chance;
import lombok.Data;

@Data
public class Decoration {
    private Chance decorationChance;
    private BlockReference decorationBlock;
    private int numSteps;
    private StepDirection stepDirection;
}