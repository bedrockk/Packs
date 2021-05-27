package com.bedrockk.packs.definition.loot.function;

import com.bedrockk.packs.definition.loot.LootTableFunction;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
public class EnchantBookForTradingFunction implements LootTableFunction {
	private int baseCost;
	private int baseRandomCost;
	private int perLevelCost;
	private int perLevelRandomCost;
}
