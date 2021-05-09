package com.bedrockk.behaviorpacks.definition.entity;

import com.bedrockk.behaviorpacks.node.PackNode;
import com.bedrockk.behaviorpacks.type.Range;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class TimerDefinition implements EntityComponentDefinition {
	private boolean looping = true;
	@JsonProperty("randomInterval")
	private boolean randomInterval = true;
	private Range time;
	private List<RandomTimeChoice> randomTimeChoices;
	private EntityEventTriggerDefinition timeDownEvent;

	@Data
	public static class RandomTimeChoice implements PackNode {
		private int weight;
		private int value;
	}
}