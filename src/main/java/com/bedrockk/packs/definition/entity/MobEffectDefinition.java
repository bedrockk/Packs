package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.definition.EntityFilterDefinition;
import lombok.Data;

@Data
public class MobEffectDefinition implements EntityComponentDefinition {
	private double effectRange = 0.2;
	private int effectTime = 10;
	private String mobEffect;
	private EntityFilterDefinition entityFilter;
}