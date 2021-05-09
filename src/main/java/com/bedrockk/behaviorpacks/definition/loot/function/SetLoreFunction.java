package com.bedrockk.behaviorpacks.definition.loot.function;

import com.bedrockk.behaviorpacks.definition.loot.LootTableFunction;
import lombok.Data;

import java.util.List;

@Data
public class SetLoreFunction implements LootTableFunction {
	private List<String> lore;
}
