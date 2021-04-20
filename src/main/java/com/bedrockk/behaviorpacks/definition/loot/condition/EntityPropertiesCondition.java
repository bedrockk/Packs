package com.bedrockk.behaviorpacks.definition.loot.condition;

import com.bedrockk.behaviorpacks.definition.loot.LootTableCondition;
import lombok.Data;

@Data
public class EntityPropertiesCondition implements LootTableCondition {
    private String entity; // always "this"
    private Properties properties;

    public static class Properties {
        private boolean onFire;
        // stands for future
    }
}
