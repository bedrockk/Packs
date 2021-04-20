package com.bedrockk.behaviorpacks.definition.loot;

import com.bedrockk.behaviorpacks.type.Range;
import lombok.Data;

import java.util.List;

@Data
public class LootTablePool {
    private List<LootTableCondition> conditions;
    private Tiers tiers;
    private Range rolls;
    private List<LootTableEntry> entries;

    @Data
    public static class Tiers {
        private int initialRange;
        private int bonusRolls;
        private double bonusChance;
    }
}
