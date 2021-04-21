package com.bedrockk.behaviorpacks.definition.loot.function;

import com.bedrockk.behaviorpacks.definition.loot.LootTableFunction;
import lombok.Data;

@Data
public class SetNameFunction implements LootTableFunction {
    private String name;
}
