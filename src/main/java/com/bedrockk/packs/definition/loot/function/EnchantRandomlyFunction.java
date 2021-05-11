package com.bedrockk.packs.definition.loot.function;

import com.bedrockk.packs.definition.loot.LootTableFunction;
import lombok.Data;

@Data
public class EnchantRandomlyFunction implements LootTableFunction {
	private boolean treasure;
}
