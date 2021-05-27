package com.bedrockk.packs.definition.entity;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class InsomniaDefinition implements EntityComponentDefinition {
	@Builder.Default
	private double daysUntilInsomnia = 3.0;
}