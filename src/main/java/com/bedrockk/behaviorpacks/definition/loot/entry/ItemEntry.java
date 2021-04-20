package com.bedrockk.behaviorpacks.definition.loot.entry;

import com.bedrockk.behaviorpacks.definition.loot.LootTableEntry;
import com.bedrockk.behaviorpacks.definition.loot.LootTableFunction;
import com.bedrockk.behaviorpacks.definition.loot.LootTablePool;
import lombok.Data;

import java.util.List;

@Data
public class ItemEntry implements LootTableEntry {
    private String name;
    private int weight;
    private List<LootTableFunction> functions;
    private List<LootTablePool> pools;
}
