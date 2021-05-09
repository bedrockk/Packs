package com.bedrockk.behaviorpacks.definition.entity;

import lombok.Data;

@Data
public class BarterDefinition implements EntityComponentDefinition {

	private String barterTable;
	private int cooldownAfterBeingAttacked = 0;
}