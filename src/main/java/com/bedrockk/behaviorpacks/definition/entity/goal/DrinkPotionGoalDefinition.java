package com.bedrockk.behaviorpacks.definition.entity.goal;

import com.bedrockk.behaviorpacks.definition.EntityFilterDefinition;
import com.bedrockk.behaviorpacks.definition.entity.EntityComponentDefinition;
import com.bedrockk.behaviorpacks.node.PackNode;
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