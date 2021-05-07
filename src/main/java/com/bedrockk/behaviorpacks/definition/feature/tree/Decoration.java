package com.bedrockk.behaviorpacks.definition.feature.tree;

import com.bedrockk.behaviorpacks.type.BlockReference;
import com.bedrockk.behaviorpacks.type.ChanceInformation;
import lombok.Data;

@Data
public class Decoration {
    private ChanceInformation decorationChance;
    private BlockReference decorationBlock;
    private int numSteps;
    private StepDirection stepDirection;
}