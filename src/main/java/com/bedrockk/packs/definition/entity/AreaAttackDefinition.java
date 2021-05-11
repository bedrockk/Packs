package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.definition.EntityFilterDefinition;
import com.bedrockk.packs.type.DamageSourceType;
import lombok.Data;

@Data
public class AreaAttackDefinition implements EntityComponentDefinition {
	private int damagePerTick = 2;
	private double damageRange = 0.2;
	private DamageSourceType cause;
	private EntityFilterDefinition entityFilter;
}