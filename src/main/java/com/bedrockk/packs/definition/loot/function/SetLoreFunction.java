package com.bedrockk.packs.definition.loot.function;

import com.bedrockk.packs.definition.loot.LootTableFunction;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
public class SetLoreFunction implements LootTableFunction {
	@Singular("line")
	private List<String> lore;
}
