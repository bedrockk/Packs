package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.definition.EntityFilterDefinition;
import com.bedrockk.packs.node.PackNode;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Singular;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
@JsonSince("1.16.100")
public class ConditionalBandwidthOptimizationDefinition implements EntityComponentDefinition {
	@Singular
	private List<CondValue> conditionalValues;
	private Value defaultValues;

	@Data
	@SuperBuilder
	@Jacksonized
	public static class Value implements PackNode {
		private int maxDroppedTicks;
		private double maxOptimizedDistance;
		private boolean useMotionPredictionHints;
	}

	@Data
	@SuperBuilder
	@Jacksonized
	@EqualsAndHashCode(callSuper = true)
	public static class CondValue extends Value {
		@Singular
		private List<EntityFilterDefinition> conditionalValues;
	}
}