package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.definition.EntityFilterDefinition;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class MobEffectDefinition implements EntityComponentDefinition {
	@Builder.Default
	private double effectRange = 0.2;
	@Builder.Default
	private int effectTime = 10;
	private String mobEffect;
	private EntityFilterDefinition entityFilter;
}