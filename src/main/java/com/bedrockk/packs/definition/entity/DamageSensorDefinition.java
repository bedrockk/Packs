package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.DamageSourceType;
import com.bedrockk.packs.type.JsonList;
import lombok.Data;

@Data
public class DamageSensorDefinition implements EntityComponentDefinition {
	private JsonList<Trigger> triggers;

	@Data
	public static class Trigger implements PackNode {
		private EntityEventTriggerDefinition onDamage;
		private DamageSourceType cause;
		private boolean dealsDamage;
		private double damageMultiplier;
		private @JsonSince("1.16.200")
		double damageModifier;
		private String onDamageSoundEvent;
	}
}