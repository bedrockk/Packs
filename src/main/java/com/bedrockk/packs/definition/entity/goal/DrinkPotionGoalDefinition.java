package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.EntityFilterDefinition;
import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import com.bedrockk.packs.node.PackNode;
import lombok.Data;

import java.util.List;

@Data
public class DrinkPotionGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private double speedMultiplier;
	private List<Potion> potions;

	@Data
	public static class Potion implements PackNode {
		private String id;
		private double chance;
		private EntityFilterDefinition filters;
	}
}