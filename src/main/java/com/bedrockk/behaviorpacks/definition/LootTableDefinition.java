package com.bedrockk.behaviorpacks.definition;

import com.bedrockk.behaviorpacks.definition.loot.LootTablePool;
import lombok.Data;

import java.util.List;

@Data
public class LootTableDefinition implements Definition {
    private List<LootTablePool> pools;
}
