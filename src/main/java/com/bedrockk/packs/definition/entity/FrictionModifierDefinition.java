package com.bedrockk.packs.definition.entity;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class FrictionModifierDefinition implements EntityComponentDefinition {
	@Builder.Default
	private double value = 1.0;
}
