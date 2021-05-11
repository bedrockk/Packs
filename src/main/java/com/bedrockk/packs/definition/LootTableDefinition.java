package com.bedrockk.packs.definition;

import com.bedrockk.packs.definition.loot.LootTablePool;
import lombok.Data;

import java.util.List;

@Data
public class LootTableDefinition implements Definition {
	private List<LootTablePool> pools;
}
