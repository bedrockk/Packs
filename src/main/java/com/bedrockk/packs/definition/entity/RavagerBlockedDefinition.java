package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.node.PackNode;
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