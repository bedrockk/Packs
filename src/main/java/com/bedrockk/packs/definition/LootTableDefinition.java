package com.bedrockk.packs.definition;

import com.bedrockk.packs.definition.loot.LootTablePool;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
public class LootTableDefinition implements Definition {
	@Singular
	private List<LootTablePool> pools;
}
