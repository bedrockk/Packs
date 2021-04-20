package com.bedrockk.behaviorpacks.definition.loot.function;

import com.bedrockk.behaviorpacks.definition.loot.LootTableFunction;
import com.bedrockk.behaviorpacks.type.Pair;
import com.bedrockk.behaviorpacks.type.Range;
import lombok.Data;

import java.util.List;

@Data
public class SpecificEnchantsFunction extends LootTableFunction {
    private List<Enchant> enchants;

    @Data
    public static class Enchant {
        private String id;
        private List<Pair<Integer, Integer>> level;
    }
}
