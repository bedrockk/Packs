package com.bedrockk.behaviorpacks.description.entity;

import com.bedrockk.behaviorpacks.description.EntityDescription;
import com.bedrockk.behaviorpacks.type.EffectType;
import lombok.Data;

@Data
public class AttackDescription implements EntityDescription {
	private double damage;
	private double effectDuration = 0.0;
	private EffectType effectName;
}
