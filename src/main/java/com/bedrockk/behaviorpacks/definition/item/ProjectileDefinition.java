package com.bedrockk.behaviorpacks.definition.item;

import lombok.Data;

@Data
public class ProjectileDefinition implements ItemComponentDefinition {
    private String projectileEntity;
    private int minimumCriticalPower = 1;
}
