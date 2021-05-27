package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.EntityFilterDefinition;
import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.FilterTarget;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;
import java.util.Locale;

@Data
@Builder
@Jacksonized
public class SummonEntityGoalDefinition implements EntityComponentDefinition {
	private int priority;
	@Singular
	private List<SummonChoice> summonChoices;

	@Data
	@Builder
	@Jacksonized
	public static class SummonChoice implements PackNode {
		@Builder.Default
		private boolean doCasting = true;
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
		private Sequence sequence;
	}

	@Data
	@Builder
	@Jacksonized
	public static class Sequence implements PackNode {
		@Builder.Default
		private Shape shape = Shape.LINE;
		@Builder.Default
		private FilterTarget target = FilterTarget.SELF;
		private double baseDelay;
		private double delayPerSummon;
		@Builder.Default
		private int numEntitiesSpawned = 1;
		private String entityType;
		@Builder.Default
		private double size = 1.0;
		@Builder.Default
		private double entityLifespan = -1;
		private String soundEvent;
		private int summonCap;
		private double summonCapRadius;
	}

	public enum Shape {
		CIRCLE,
		LINE;

		@Override
		public String toString() {
			return name().toLowerCase(Locale.ENGLISH);
		}
	}
}