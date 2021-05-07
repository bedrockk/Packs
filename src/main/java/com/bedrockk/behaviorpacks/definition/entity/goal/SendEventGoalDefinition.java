package com.bedrockk.behaviorpacks.definition.entity.goal;

import com.bedrockk.behaviorpacks.definition.EntityFilterDefinition;
import com.bedrockk.behaviorpacks.definition.entity.EntityComponentDefinition;
import com.bedrockk.behaviorpacks.node.PackNode;
import com.bedrockk.behaviorpacks.type.FilterTarget;
import lombok.Data;

import java.util.List;

@Data
public class SendEventGoalDefinition implements EntityComponentDefinition{
	private int priority;
	private List<EventChoice> eventChoices;

	@Data
	public static class EventChoice implements PackNode {
		private EntityFilterDefinition filters;
		private double minActivationRange = 1.0;
		private double maxActivationRange = 32.0;
		private double cooldownTime;
		private int weight;
		private double castDuration;
		private int particleColor;
		private String startSoundEvent;
		private boolean lookAtTarget;
		private Sequence sequence;
	}

	@Data
	public static class Sequence implements PackNode {
		private double baseDelay;
		private String event;
		private String soundEvent;
	}
}