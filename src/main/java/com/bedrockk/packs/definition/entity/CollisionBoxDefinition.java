package com.bedrockk.packs.definition.entity;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class CollisionBoxDefinition implements EntityComponentDefinition {
	@Builder.Default
	private double height = 1.0;
	@Builder.Default
	private double width = 1.0;
}
