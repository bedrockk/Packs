package com.bedrockk.behaviorpacks.definition.entity;

import lombok.Data;

import java.util.List;

@Data
public class ItemControllableDefinition implements EntityComponentDefinition {
    private List<String> controlItems;
}
