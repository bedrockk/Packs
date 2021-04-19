package com.bedrockk.behaviorpacks.definition.item;

import lombok.Data;

@Data
public class ThrowableDefinition implements ItemComponentDefinition {
    private boolean doSwingAnimation;
    private int maxDrawDuration;
    private boolean scalePowerByDrawDuration;
}
