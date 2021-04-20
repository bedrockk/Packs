package com.bedrockk.behaviorpacks.definition.feature.tree;

import com.bedrockk.behaviorpacks.type.BlockReference;
import lombok.Data;

@Data
public class AcaciaCanopy {
    private int canopySize;
    private Boolean simplifyCanopy;
    private BlockReference leafBlock;
}