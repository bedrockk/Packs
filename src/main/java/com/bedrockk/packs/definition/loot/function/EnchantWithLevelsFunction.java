package com.bedrockk.packs.definition.loot.function;

import com.bedrockk.packs.definition.loot.LootTableFunction;
import com.bedrockk.packs.type.Range;
import lombok.Data;

@Data
public class EnchantWithLevelsFunction implements LootTableFunction {
	private Double chance;
	private Range levels;
	private boolean treasure;
}
