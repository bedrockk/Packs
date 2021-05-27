package com.bedrockk.packs.definition.entity;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class PlayerExperienceDefinition implements EntityComponentDefinition {
	private double value;
	private double max;
	private double min;
}