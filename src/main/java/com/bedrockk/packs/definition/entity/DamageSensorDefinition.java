package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.DamageSourceType;
import com.bedrockk.packs.type.JsonList;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class DamageSensorDefinition implements EntityComponentDefinition {
	private JsonList<Trigger> triggers;

	@Data
	@Builder
	@Jacksonized
	public static class Trigger implements PackNode {
		private EntityEventTriggerDefinition onDamage;
		private DamageSourceType cause;
		private boolean dealsDamage;
		private double damageMultiplier;
		@JsonSince("1.16.200")
		private double damageModifier;
		private String onDamageSoundEvent;
	}
}