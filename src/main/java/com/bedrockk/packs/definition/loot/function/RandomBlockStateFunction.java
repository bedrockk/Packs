package com.bedrockk.packs.definition.loot.function;

import com.bedrockk.packs.definition.loot.LootTableFunction;
import com.bedrockk.packs.type.Range;
import lombok.Data;

@Data
public class RandomBlockStateFunction implements LootTableFunction {
	private String blockState;
	private Range values;
}
