package com.bedrockk.behaviorpacks.definition.item;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class EntityPlacerDefinition implements ItemComponentDefinition {
    private String entity;
    private List<String> allowedBlocks = new ArrayList<>();
}
