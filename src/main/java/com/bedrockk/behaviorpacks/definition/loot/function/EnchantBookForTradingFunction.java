package com.bedrockk.behaviorpacks.definition.loot.function;

import com.bedrockk.behaviorpacks.definition.loot.LootTableFunction;
import lombok.Data;

@Data
public class EnchantBookForTradingFunction implements LootTableFunction {
    private int baseCost;
    private int baseRandomCost;
    private int perLevelCost;
    private int perLevelRandomCost;
}
