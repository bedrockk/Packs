package com.bedrockk.packs.definition.loot.entry;

import com.bedrockk.packs.definition.loot.LootPoolEntry;
import com.bedrockk.packs.definition.loot.LootTableFunction;
import com.bedrockk.packs.definition.loot.LootTablePool;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@Jacksonized
public class ItemEntry extends LootPoolEntry {
	private String name;
	private int weight;
	private List<LootTableFunction> functions;
	private List<LootTablePool> pools;
}
