package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.definition.EntityFilterDefinition;
import com.bedrockk.packs.node.PackNode;
import lombok.Data;

@Data
public class EntityType implements PackNode {
	private EntityFilterDefinition filters;
	private double maxDist = 16.0;
	private boolean mustSee = false;
	private boolean checkIfOutnumbered = false;
	private double mustSeeForgetDuration = 3.0;
	private double sprintSpeedMultiplier = 1.0;
	private double walkSpeedMultiplier = 1.0;
}
