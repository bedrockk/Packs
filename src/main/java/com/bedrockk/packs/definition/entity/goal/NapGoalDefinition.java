package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Data;

@Data
public class NapGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private double cooldownMax = 0.0;
	private double cooldownMin = 0.0;
	private double mobDetectDist = 6.0;
	private double mobDetectHeight = 6.0;
}