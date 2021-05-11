package com.bedrockk.packs.definition.loot.condition;

import com.bedrockk.packs.definition.loot.LootTableCondition;
import lombok.Data;

@Data
public class RandomRegionalDifficultyChanceCondition implements LootTableCondition {
	private double maxChance;
}
