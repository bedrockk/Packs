package com.bedrockk.behaviorpacks.definition.loot.function;

import com.bedrockk.behaviorpacks.definition.loot.LootTableFunction;
import lombok.Data;

@Data
public class EnchantRandomGearFunction implements LootTableFunction {
	private double chance;
}
