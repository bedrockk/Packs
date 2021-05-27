package com.bedrockk.packs.definition.loot.function;

import com.bedrockk.packs.definition.loot.LootTableFunction;
import com.bedrockk.packs.type.Range;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
public class RandomBlockStateFunction implements LootTableFunction {
	private String blockState;
	private Range values;
}
