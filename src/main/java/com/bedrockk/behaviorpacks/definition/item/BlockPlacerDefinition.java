package com.bedrockk.behaviorpacks.definition.item;

import lombok.Data;

@Data
public class BlockPlacerDefinition implements ItemComponentDefinition {
    private String block;
    private boolean useBlockDescription = false;
}
