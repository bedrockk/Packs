package com.bedrockk.packs.definition.loot.condition;

import com.bedrockk.packs.definition.loot.LootTableCondition;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
public class RandomChanceWithLootingCondition implements LootTableCondition {
	private double chance;
	private double lootingMultiplier;
}
