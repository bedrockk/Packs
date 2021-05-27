package com.bedrockk.packs.definition.entity;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class ShooterDefinition implements EntityComponentDefinition {

	private int auxVal;
	private String def;
}