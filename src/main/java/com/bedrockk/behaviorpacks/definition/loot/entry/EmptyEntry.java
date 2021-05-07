package com.bedrockk.behaviorpacks.definition.loot.entry;

import com.bedrockk.behaviorpacks.definition.loot.LootPoolEntry;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class EmptyEntry extends LootPoolEntry {
    private int weight;
}
