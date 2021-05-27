package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.EntityFilterDefinition;
import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import com.bedrockk.packs.node.PackNode;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
public class DrinkPotionGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private double speedMultiplier;
	@Singular
	private List<Potion> potions;

	@Data
	@Builder
	@Jacksonized
	public static class Potion implements PackNode {
		private String id;
		private double chance;
		private EntityFilterDefinition filters;
	}
}