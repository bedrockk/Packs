package com.bedrockk.behaviorpacks.definition.loot.entry;

import com.bedrockk.behaviorpacks.definition.loot.LootTableEntry;
import lombok.Data;

@Data
public class EmptyEntry implements LootTableEntry {
    private int weight;
}
