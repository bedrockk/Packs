package com.bedrockk.behaviorpacks.definition.loot.entry;

import com.bedrockk.behaviorpacks.definition.loot.LootTableEntry;
import lombok.Data;

import java.nio.file.Path;

@Data
public class TableEntry implements LootTableEntry {
    private Path name;
    private int weight;
}
