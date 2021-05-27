package com.bedrockk.packs.definition.entity;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class HorseJumpStrengthDefinition implements EntityComponentDefinition {
	private double value;
}
