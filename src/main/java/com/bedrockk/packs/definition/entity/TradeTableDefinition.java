package com.bedrockk.packs.definition.entity;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class TradeTableDefinition implements EntityComponentDefinition {

	private boolean convertTradesEconomy;
	private String displayName;
	private boolean newScreen;
	private boolean persistTrades;
	private String table;
}