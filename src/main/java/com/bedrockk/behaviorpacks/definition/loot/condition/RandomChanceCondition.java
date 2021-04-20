package com.bedrockk.behaviorpacks.definition.loot.condition;

import com.bedrockk.behaviorpacks.definition.loot.LootTableCondition;
import lombok.Data;

@Data
public class RandomChanceCondition implements LootTableCondition {
    private double chance;
}
