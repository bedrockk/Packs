package com.bedrockk.behaviorpacks.description.block;

import com.bedrockk.behaviorpacks.description.BlockDescription;
import lombok.Data;

@Data
public class BlockFlammableDescription implements BlockDescription {
    private double burnOdds;
    private double flameOdds;
}
