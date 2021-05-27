package com.bedrockk.packs.definition.entity;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class ScaleByAgeDefinition implements EntityComponentDefinition {
	@Builder.Default
	private double endScale = 1.0;
	@Builder.Default
	private double startScale = 1.0;
}