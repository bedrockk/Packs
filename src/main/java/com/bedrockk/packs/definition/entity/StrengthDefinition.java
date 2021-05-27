package com.bedrockk.packs.definition.entity;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class StrengthDefinition implements EntityComponentDefinition {
	@Builder.Default
	private int max = 5;
	@Builder.Default
	private int value = 1;
}