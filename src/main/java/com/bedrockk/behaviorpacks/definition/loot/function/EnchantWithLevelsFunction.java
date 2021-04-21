package com.bedrockk.behaviorpacks.definition.loot.function;

import com.bedrockk.behaviorpacks.definition.loot.LootTableFunction;
import com.bedrockk.behaviorpacks.type.Range;
import lombok.Data;

@Data
public class EnchantWithLevelsFunction implements LootTableFunction {
    private Double chance;
    private Range levels;
    private boolean treasure;
}
