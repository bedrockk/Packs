package com.bedrockk.behaviorpacks.definition.feature.tree;

import com.bedrockk.behaviorpacks.type.BlockReference;
import lombok.Data;

@Data
public class MegaCanopy {
    private int canopyHeight;
    private Integer coreWidth;
    private int baseRadius;
    private Boolean simplifyCanopy;
    private BlockReference leafBlock;
}