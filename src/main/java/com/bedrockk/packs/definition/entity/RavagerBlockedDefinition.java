package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.node.PackNode;
import lombok.*;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
public class RavagerBlockedDefinition implements EntityComponentDefinition {
	@Builder.Default
	private double knockbackStrength = 3.0;
	@Singular
	private List<ReactionChoice> reactionChoices;

	@Data
	@NoArgsConstructor
	@AllArgsConstructor(staticName = "of")
	public static class ReactionChoice implements PackNode {
		private int weight;
		private EntityEventTriggerDefinition value;
	}
}