package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.annotation.JsonSince;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
@JsonSince("1.16.220")
public class CombatRegenerationDefinition implements EntityComponentDefinition {
	private double regenerationDuration;
}
