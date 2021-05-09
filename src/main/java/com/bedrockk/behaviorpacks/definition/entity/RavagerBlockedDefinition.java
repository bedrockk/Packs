package com.bedrockk.behaviorpacks.definition.entity;

import com.bedrockk.behaviorpacks.node.PackNode;
import lombok.Data;

import java.util.List;

@Data
public class RavagerBlockedDefinition implements EntityComponentDefinition {
	private double knockbackStrength = 3.0;
	private List<ReactionChoice> reactionChoices;

	@Data
	public static class ReactionChoice implements PackNode {
		private int weight;
		private EntityEventTriggerDefinition value;
	}
}