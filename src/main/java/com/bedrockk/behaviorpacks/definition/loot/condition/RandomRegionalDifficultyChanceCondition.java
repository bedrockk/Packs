package com.bedrockk.behaviorpacks.definition.loot.condition;

import com.bedrockk.behaviorpacks.definition.loot.LootTableCondition;
import lombok.Data;

@Data
public class RandomRegionalDifficultyChanceCondition implements LootTableCondition {
    private double maxChance;
}
