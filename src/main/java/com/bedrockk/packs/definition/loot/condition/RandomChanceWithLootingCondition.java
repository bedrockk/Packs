package com.bedrockk.packs.definition.loot.condition;

import com.bedrockk.packs.definition.loot.LootTableCondition;
import lombok.Data;

@Data
public class RandomChanceWithLootingCondition implements LootTableCondition {
	private double chance;
	private double lootingMultiplier;
}
