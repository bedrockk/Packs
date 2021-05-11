package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Data;

@Data
public class HoldGroundGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private boolean broadcast = false;
	private double broadcastRange = 0.0;
	private double minRadius = 10.0;
	private String withinRadiusEvent;
}