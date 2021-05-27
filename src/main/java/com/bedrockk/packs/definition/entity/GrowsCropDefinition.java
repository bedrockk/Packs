package com.bedrockk.packs.definition.entity;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class GrowsCropDefinition implements EntityComponentDefinition {

	private double chance;
	@Builder.Default
	private int charges = 10;
}