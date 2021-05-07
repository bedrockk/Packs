package com.bedrockk.behaviorpacks.definition.loot.entry;

import com.bedrockk.behaviorpacks.definition.loot.LootPoolEntry;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.nio.file.Path;

@EqualsAndHashCode(callSuper = true)
@Data
public class TableEntry extends LootPoolEntry {
    private Path name;
    private int weight;
}
