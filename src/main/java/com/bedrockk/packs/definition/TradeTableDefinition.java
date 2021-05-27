package com.bedrockk.packs.definition;

import com.bedrockk.packs.definition.loot.LootTableFunction;
import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.Range;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
public class TradeTableDefinition implements Definition {
	@Singular
	private List<Tier> tiers;

	@Data
	@Builder
	@Jacksonized
	public static class Tier implements PackNode {
		private Integer totalExpRequired;
		@Singular
		private List<Trade> trades;
		@Singular
		private List<Group> groups;
	}

	@Data
	@Builder
	@Jacksonized
	public static class Group implements PackNode {
		@Singular
		private List<Trade> trades;
		private int numToSelect;
	}

	@Data
	@Builder
	@Jacksonized
	public static class Trade implements PackNode {
		@Singular
		private List<WantEntry> wants;
		@Singular("give")
		private List<GiveEntry> gives;
		private Integer tradeExp;
		private Integer maxUses;
		private Boolean rewardExp;
	}

	@Data
	@Builder
	@Jacksonized
	public static class WantEntry implements PackNode {
		private String item;
		private Range quantity;
		@Singular
		private List<LootTableFunction> functions;
		private Double priceMultiplier;
	}

	@Data
	@Builder
	@Jacksonized
	public static class GiveEntry implements PackNode {
		private String item;
		private Range quantity;
		@Singular
		private List<LootTableFunction> functions;
		@Singular
		@JsonProperty("choice")
		private List<GiveEntry> choices;
	}
}
