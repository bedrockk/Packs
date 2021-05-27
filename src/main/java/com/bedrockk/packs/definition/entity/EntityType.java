package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.definition.EntityFilterDefinition;
import com.bedrockk.packs.node.PackNode;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@Data
@SuperBuilder
@Jacksonized
public class EntityType implements PackNode {
	private EntityFilterDefinition filters;
	@Builder.Default
	private double maxDist = 16.0;
	private boolean mustSee;
	private boolean checkIfOutnumbered;
	@Builder.Default
	private double mustSeeForgetDuration = 3.0;
	@Builder.Default
	private double sprintSpeedMultiplier = 1.0;
	@Builder.Default
	private double walkSpeedMultiplier = 1.0;
}
