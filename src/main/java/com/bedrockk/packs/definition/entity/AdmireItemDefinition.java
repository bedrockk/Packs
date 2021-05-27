package com.bedrockk.packs.definition.entity;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class AdmireItemDefinition implements EntityComponentDefinition {

	private int cooldownAfterBeingAttacked;
	@Builder.Default
	private int duration = 10;
}