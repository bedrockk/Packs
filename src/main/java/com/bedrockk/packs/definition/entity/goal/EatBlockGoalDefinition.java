package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import com.bedrockk.packs.definition.entity.EntityEventTriggerDefinition;
import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.ExpressionNode;
import lombok.*;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
@JsonSince("1.16.0")
public class EatBlockGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private ExpressionNode successChance;
	private int timeUntilEat;
	@Singular
	private List<Entry> eatAndReplaceBlockPairs;
	private EntityEventTriggerDefinition onEat;

	@Data
	@NoArgsConstructor
	@AllArgsConstructor(staticName = "of")
	public static class Entry implements PackNode {
		private String eatBlock;
		private String replaceBlock;
	}
}