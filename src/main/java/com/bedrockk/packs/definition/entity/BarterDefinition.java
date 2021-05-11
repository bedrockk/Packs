package com.bedrockk.packs.definition.entity;

import lombok.Data;

@Data
public class BarterDefinition implements EntityComponentDefinition {

	private String barterTable;
	private int cooldownAfterBeingAttacked = 0;
}