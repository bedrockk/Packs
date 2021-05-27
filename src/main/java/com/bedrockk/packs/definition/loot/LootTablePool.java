package com.bedrockk.packs.definition.loot;

import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.Range;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
public class LootTablePool implements PackNode {
	@Singular
	private List<LootTableCondition> conditions;
	private Tiers tiers;
	private Range rolls;
	@Singular
	private List<LootPoolEntry> entries;

	@Data
	@Builder
	@Jacksonized
	public static class Tiers implements PackNode {
		private int initialRange;
		private int bonusRolls;
		private double bonusChance;
	}
}
