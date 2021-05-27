package com.bedrockk.packs.definition.entity;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class BossDefinition implements EntityComponentDefinition {
	@Builder.Default
	private int hudRange = 55;
	private String name;
	private boolean shouldDarkenSky;
}