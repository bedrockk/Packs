package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.type.Pair;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
public class EconomyTradeTableDefinition implements EntityComponentDefinition {
	private boolean convertTradesEconomy;
	private String displayName;
	private int heroDemandDiscount;
	private int maxNearbyCuredDiscount;
	private int nearbyCuredDiscount;
	private boolean newScreen;
	private boolean persistTrades;
	@Builder.Default
	private boolean showTradeScreen = true;
	private String table;
	private boolean useLegacyPriceFormula;
	@Singular("addCuredDiscount")
	private List<Pair<Integer, Integer>> curedDiscount;
	@Singular("addMaxCuredDiscount")
	private List<Pair<Integer, Integer>> maxCuredDiscount;
}