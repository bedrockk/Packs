package com.bedrockk.behaviorpacks.definition.entity;

import com.bedrockk.behaviorpacks.annotation.JsonSince;
import com.bedrockk.behaviorpacks.definition.EntityFilterDefinition;
import com.bedrockk.behaviorpacks.node.PackNode;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@JsonSince("1.16.100")
public class ConditionalBandwidthOptimizationDefinition implements EntityComponentDefinition{
	private List<CondValue> conditionalValues;
	private Value defaultValues;

	@Data
	public static class Value implements PackNode {
		private int maxDroppedTicks;
		private double maxOptimizedDistance;
		private boolean useMotionPredictionHints;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class CondValue extends Value {
		private List<EntityFilterDefinition> conditionalValues;
	}
}