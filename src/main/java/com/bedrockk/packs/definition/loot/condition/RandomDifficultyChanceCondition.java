package com.bedrockk.packs.definition.loot.condition;

import com.bedrockk.packs.definition.loot.LootTableCondition;
import lombok.Data;

@Data
public class RandomDifficultyChanceCondition implements LootTableCondition {
	private double defaultChance;
	private Double peaceful;
	private double hard;
}
