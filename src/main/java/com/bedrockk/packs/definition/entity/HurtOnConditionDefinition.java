package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.definition.EntityFilterDefinition;
import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.DamageSourceType;
import lombok.Data;

import java.util.List;

@Data
public class HurtOnConditionDefinition implements EntityComponentDefinition {
	private List<DamageCondition> damageConditions;

	@Data
	public static class DamageCondition implements PackNode {
		private EntityFilterDefinition filters;
		private DamageSourceType cause;
		private int damagePerTick;
	}
}