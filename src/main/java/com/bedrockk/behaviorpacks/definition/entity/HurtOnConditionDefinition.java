package com.bedrockk.behaviorpacks.definition.entity;

import com.bedrockk.behaviorpacks.definition.EntityFilterDefinition;
import com.bedrockk.behaviorpacks.node.PackNode;
import com.bedrockk.behaviorpacks.type.DamageSourceType;
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