package com.bedrockk.behaviorpacks.definition.item;

import com.bedrockk.behaviorpacks.node.ItemComponentNode;
import lombok.Data;

@Data
public class ThrowableDefinition implements ItemComponentNode {
    private boolean doSwingAnimation;
    private int maxDrawDuration;
    private boolean scalePowerByDrawDuration;
}
