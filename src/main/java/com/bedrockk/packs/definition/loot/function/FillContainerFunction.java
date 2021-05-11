package com.bedrockk.packs.definition.loot.function;

import com.bedrockk.packs.definition.loot.LootTableFunction;
import lombok.Data;

import java.nio.file.Path;

@Data
public class FillContainerFunction implements LootTableFunction {
	private Path lootTable;
}
