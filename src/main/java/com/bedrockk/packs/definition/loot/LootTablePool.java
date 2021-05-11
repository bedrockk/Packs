package com.bedrockk.packs.definition.loot;

import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.Range;
import lombok.Data;

import java.util.List;

@Data
public class LootTablePool implements PackNode {
	private List<LootTableCondition> conditions;
	private Tiers tiers;
	private Range rolls;
	private List<LootPoolEntry> entries;

	@Data
	public static class Tiers implements PackNode {
		private int initialRange;
		private int bonusRolls;
		private double bonusChance;
	}
}
