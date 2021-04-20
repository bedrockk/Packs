package com.bedrockk.behaviorpacks.definition.loot.function;

import com.bedrockk.behaviorpacks.definition.loot.LootTableFunction;
import com.bedrockk.behaviorpacks.type.Range;
import lombok.Data;

@Data
public class SetNameFunction extends LootTableFunction {
    private String name;
}
