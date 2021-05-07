package com.bedrockk.behaviorpacks.definition.entity.goal;

import com.bedrockk.behaviorpacks.annotation.JsonSince;
import com.bedrockk.behaviorpacks.definition.entity.EntityComponentDefinition;
import com.bedrockk.behaviorpacks.definition.entity.EntityEventTriggerDefinition;
import com.bedrockk.behaviorpacks.node.PackNode;
import com.bedrockk.behaviorpacks.type.ExpressionNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.util.StdConverter;
import lombok.Data;

import java.util.List;

@Data
@JsonSince("1.16.0")
public class EatBlockGoalDefinition implements EntityComponentDefinition{
	private int priority;
	private ExpressionNode successChance;
	private int timeUntilEat;
	private List<Entry> eatAndReplaceBlockPairs;
	private EntityEventTriggerDefinition onEat;

	@Data
	public static class Entry implements PackNode {
		private String eatBlock;
		private String replaceBlock;
	}
}