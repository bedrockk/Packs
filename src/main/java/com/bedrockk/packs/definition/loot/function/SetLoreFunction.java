package com.bedrockk.packs.definition.loot.function;

import com.bedrockk.packs.definition.loot.LootTableFunction;
import lombok.Data;

import java.util.List;

@Data
public class SetLoreFunction implements LootTableFunction {
	private List<String> lore;
}
