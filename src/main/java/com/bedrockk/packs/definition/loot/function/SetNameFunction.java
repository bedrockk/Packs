package com.bedrockk.packs.definition.loot.function;

import com.bedrockk.packs.definition.loot.LootTableFunction;
import lombok.Data;

@Data
public class SetNameFunction implements LootTableFunction {
	private String name;
}
