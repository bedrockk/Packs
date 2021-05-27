package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.definition.EntityFilterDefinition;
import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.DamageSourceType;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
public class HurtOnConditionDefinition implements EntityComponentDefinition {
	@Singular
	private List<DamageCondition> damageConditions;

	@Data
	@Builder
	@Jacksonized
	public static class DamageCondition implements PackNode {
		private EntityFilterDefinition filters;
		private DamageSourceType cause;
		private int damagePerTick;
	}
}