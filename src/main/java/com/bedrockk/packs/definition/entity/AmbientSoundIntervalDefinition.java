package com.bedrockk.packs.definition.entity;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class AmbientSoundIntervalDefinition implements EntityComponentDefinition {
	private String eventName;
	@Builder.Default
	private double range = 16.0; // max
	@Builder.Default
	private double value = 8.0; // min
}
