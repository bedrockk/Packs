package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.definition.EntityFilterDefinition;
import com.bedrockk.packs.type.Range;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class CelebrateHuntDefinition implements EntityComponentDefinition {
	@Builder.Default
	private boolean broadcast = true;
	private EntityFilterDefinition celeberationTargets;
	private String celebrateSound;
	@Builder.Default
	private int duration = 4;
	@Builder.Default
	private double radius = 16.0;
	private Range soundInterval;
}