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
public class SendEventGoalDefinition implements EntityComponentDefinition {
	private int priority;
	@Singular
	private List<EventChoice> eventChoices;

	@Data
	@Builder
	@Jacksonized
	public static class EventChoice implements PackNode {
		private EntityFilterDefinition filters;
		@Builder.Default
		private double minActivationRange = 1.0;
		@Builder.Default
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
	@Builder
	@Jacksonized
	public static class Sequence implements PackNode {
		private double baseDelay;
		private String event;
		private String soundEvent;
	}
}