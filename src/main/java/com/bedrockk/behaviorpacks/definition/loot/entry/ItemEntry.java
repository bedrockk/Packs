package com.bedrockk.behaviorpacks.definition.loot.entry;

import com.bedrockk.behaviorpacks.definition.loot.LootPoolEntry;
import com.bedrockk.behaviorpacks.definition.loot.LootTableFunction;
import com.bedrockk.behaviorpacks.definition.loot.LootTablePool;
import lombok.Data;

import java.util.List;

@Data
public class ItemEntry extends LootPoolEntry {
    private String name;
    private int weight;
    private List<LootTableFunction> functions;
    private List<LootTablePool> pools;
}
