package com.bedrockk.behaviorpacks.definition.loot.entry;

import com.bedrockk.behaviorpacks.definition.loot.LootPoolEntry;
import lombok.Data;

import java.nio.file.Path;

@Data
public class TableEntry extends LootPoolEntry {
    private Path name;
    private int weight;
}
