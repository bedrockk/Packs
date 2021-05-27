package com.bedrockk.packs.definition.loot.function;

import com.bedrockk.packs.definition.loot.LootTableFunction;
import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.Pair;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
public class SpecificEnchantsFunction implements LootTableFunction {
	@Singular
	private List<Enchant> enchants;

	@Data
	@Builder
	@Jacksonized
	public static class Enchant implements PackNode {
		private String id;
		@Singular("addLevel")
		private List<Pair<Integer, Integer>> level;
	}
}
