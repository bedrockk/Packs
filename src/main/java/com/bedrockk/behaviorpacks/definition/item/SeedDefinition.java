package com.bedrockk.behaviorpacks.definition.item;

import com.bedrockk.behaviorpacks.node.ItemComponentNode;
import lombok.Data;

@Data
public class SeedDefinition implements ItemComponentNode {
    private String cropResult;
    private String plantAt; // block
}
