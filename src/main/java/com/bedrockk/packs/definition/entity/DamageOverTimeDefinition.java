package com.bedrockk.packs.definition.entity;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class DamageOverTimeDefinition implements EntityComponentDefinition {
	@Builder.Default
	private int damagePerHurt = 1;
	private double timeBetweenHurt;
}