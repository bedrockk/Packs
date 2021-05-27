package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.definition.EntityFilterDefinition;
import com.bedrockk.packs.type.DamageSourceType;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class AreaAttackDefinition implements EntityComponentDefinition {
	@Builder.Default
	private int damagePerTick = 2;
	@Builder.Default
	private double damageRange = 0.2;
	private DamageSourceType cause;
	private EntityFilterDefinition entityFilter;
}