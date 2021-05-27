package com.bedrockk.packs.definition.entity;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class BarterDefinition implements EntityComponentDefinition {

	private String barterTable;
	private int cooldownAfterBeingAttacked;
}