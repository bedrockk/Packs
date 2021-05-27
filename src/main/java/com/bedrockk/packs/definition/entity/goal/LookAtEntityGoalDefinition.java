package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.EntityFilterDefinition;
import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import com.bedrockk.packs.type.Range;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@SuperBuilder
@Jacksonized
public class LookAtEntityGoalDefinition implements EntityComponentDefinition {
	private int priority;
	@Builder.Default
	private int angleOfViewHorizontal = 360;
	@Builder.Default
	private int angleOfViewVertical = 360;
	@Singular
	private List<EntityFilterDefinition> filters;
	@Builder.Default
	private double lookDistance = 8.0;
	private Range lookTime;
	@Builder.Default
	private double probability = 0.02;
}