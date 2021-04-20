package com.bedrockk.behaviorpacks.definition.loot.condition;

import com.bedrockk.behaviorpacks.definition.loot.LootTableCondition;
import lombok.Data;

@Data
public class RandomDifficultyChanceCondition implements LootTableCondition {
    private double defaultChance;
    private double peaceful;
    private double hard;
}