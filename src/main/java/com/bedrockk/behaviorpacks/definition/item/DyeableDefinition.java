package com.bedrockk.behaviorpacks.definition.item;

import com.bedrockk.behaviorpacks.node.ItemComponentNode;
import lombok.Data;

@Data
public class DyeableDefinition implements ItemComponentNode {
    private String defaultColor;
}
