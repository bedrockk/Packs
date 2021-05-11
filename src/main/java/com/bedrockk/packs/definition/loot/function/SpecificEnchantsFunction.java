package com.bedrockk.packs.definition.loot.function;

import com.bedrockk.packs.definition.loot.LootTableFunction;
import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.Pair;
import lombok.Data;

import java.util.List;

@Data
public class SpecificEnchantsFunction implements LootTableFunction {
	private List<Enchant> enchants;

	@Data
	public static class Enchant implements PackNode {
		private String id;
		private List<Pair<Integer, Integer>> level;
	}
}
