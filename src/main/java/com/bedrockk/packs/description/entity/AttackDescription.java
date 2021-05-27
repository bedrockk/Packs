package com.bedrockk.packs.description.entity;

import com.bedrockk.packs.description.EntityDescription;
import com.bedrockk.packs.type.EffectType;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class AttackDescription implements EntityDescription {
	private double damage;
	private double effectDuration;
	private EffectType effectName;
}
