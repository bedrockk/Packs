package com.bedrockk.behaviorpacks.definition.entity;

import com.bedrockk.behaviorpacks.type.Pair;
import lombok.Data;

import java.util.List;

@Data
public class EconomyTradeTableDefinition implements EntityComponentDefinition{
	private boolean convertTradesEconomy = false;
	private String displayName;
	private int heroDemandDiscount;
	private int maxNearbyCuredDiscount;
	private int nearbyCuredDiscount;
	private boolean newScreen = false;
	private boolean persistTrades = false;
	private boolean showTradeScreen = true;
	private String table;
	private boolean useLegacyPriceFormula = false;
	private List<Pair<Integer, Integer>> curedDiscount;
	private List<Pair<Integer, Integer>> maxCuredDiscount;
}