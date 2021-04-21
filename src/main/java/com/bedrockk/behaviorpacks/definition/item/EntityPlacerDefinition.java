package com.bedrockk.behaviorpacks.definition.item;

import com.bedrockk.behaviorpacks.node.ItemComponentNode;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class EntityPlacerDefinition implements ItemComponentNode {
    private String entity;
    private List<String> allowedBlocks = new ArrayList<>();
}
