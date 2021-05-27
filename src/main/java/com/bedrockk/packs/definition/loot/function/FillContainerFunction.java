package com.bedrockk.packs.definition.loot.function;

import com.bedrockk.packs.definition.loot.LootTableFunction;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.nio.file.Path;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
public class FillContainerFunction implements LootTableFunction {
	private Path lootTable;
}
