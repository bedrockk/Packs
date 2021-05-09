package com.bedrockk.behaviorpacks.definition.loot.function;

import com.bedrockk.behaviorpacks.definition.loot.LootTableFunction;
import com.bedrockk.behaviorpacks.node.PackNode;
import com.bedrockk.behaviorpacks.type.Pair;
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
