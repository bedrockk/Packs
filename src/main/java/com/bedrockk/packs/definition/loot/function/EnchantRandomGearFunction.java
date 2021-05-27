package com.bedrockk.packs.definition.loot.function;

import com.bedrockk.packs.definition.loot.LootTableFunction;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
public class EnchantRandomGearFunction implements LootTableFunction {
	private double chance;
}
