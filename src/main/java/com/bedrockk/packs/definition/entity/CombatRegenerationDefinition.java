package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.annotation.JsonSince;
import lombok.Data;

@Data
@JsonSince("1.16.220")
public class CombatRegenerationDefinition implements EntityComponentDefinition {
	private double regenerationDuration;
}
