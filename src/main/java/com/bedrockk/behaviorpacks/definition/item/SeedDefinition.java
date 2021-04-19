package com.bedrockk.behaviorpacks.definition.item;

import lombok.Data;

@Data
public class SeedDefinition implements ItemComponentDefinition {
    private String cropResult;
    private String plantAt; // block
}
