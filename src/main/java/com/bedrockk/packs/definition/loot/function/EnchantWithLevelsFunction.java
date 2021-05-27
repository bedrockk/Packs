package com.bedrockk.packs.definition.loot.function;

import com.bedrockk.packs.definition.loot.LootTableFunction;
import com.bedrockk.packs.type.Range;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
public class EnchantWithLevelsFunction implements LootTableFunction {
	private double chance;
	private Range levels;
	private boolean treasure;
}
