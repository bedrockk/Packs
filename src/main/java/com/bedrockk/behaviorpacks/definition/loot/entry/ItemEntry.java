package com.bedrockk.behaviorpacks.definition.loot.entry;

import com.bedrockk.behaviorpacks.definition.loot.LootPoolEntry;
import com.bedrockk.behaviorpacks.definition.loot.LootTableFunction;
import com.bedrockk.behaviorpacks.definition.loot.LootTablePool;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class ItemEntry extends LootPoolEntry {
	private String name;
	private int weight;
	private List<LootTableFunction> functions;
	private List<LootTablePool> pools;
}
