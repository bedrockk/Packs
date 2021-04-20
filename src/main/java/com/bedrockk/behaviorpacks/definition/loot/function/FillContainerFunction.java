package com.bedrockk.behaviorpacks.definition.loot.function;

import com.bedrockk.behaviorpacks.definition.loot.LootTableFunction;
import lombok.Data;

import java.nio.file.Path;

@Data
public class FillContainerFunction extends LootTableFunction {
    private Path lootTable;
}