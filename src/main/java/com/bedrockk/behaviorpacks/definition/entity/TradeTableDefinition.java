package com.bedrockk.behaviorpacks.definition.entity;

import lombok.Data;

@Data
public class TradeTableDefinition implements EntityComponentDefinition {

	private boolean convertTradesEconomy = false;
	private String displayName;
	private boolean newScreen = false;
	private boolean persistTrades = false;
	private String table;
}