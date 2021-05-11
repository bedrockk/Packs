package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.EntityFilterDefinition;
import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.FilterTarget;
import lombok.Data;

import java.util.List;
import java.util.Locale;

@Data
public class SummonEntityGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private List<SummonChoice> summonChoices;

	@Data
	public static class SummonChoice implements PackNode {
		private boolean doCasting = true;
		private EntityFilterDefinition filters;
		private double minActivationRange = 1.0;
		private double maxActivationRange = 32.0;
		private double cooldownTime;
		private int weight;
		private double castDuration;
		private int particleColor;
		private String startSoundEvent;
		private Sequence sequence;
	}

	@Data
	public static class Sequence implements PackNode {
		private Shape shape = Shape.LINE;
		private FilterTarget target = FilterTarget.SELF;
		private double baseDelay;
		private double delayPerSummon;
		private int numEntitiesSpawned = 1;
		private String entityType;
		private double size = 1.0;
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