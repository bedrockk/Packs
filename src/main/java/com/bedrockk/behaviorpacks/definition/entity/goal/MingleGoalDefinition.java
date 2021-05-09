package com.bedrockk.behaviorpacks.definition.entity.goal;

import com.bedrockk.behaviorpacks.definition.entity.EntityComponentDefinition;
import lombok.Data;

@Data
public class MingleGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private double cooldownTime = 0.0;
	private double duration = 1.0;
	private double mingleDistance = 2.0;
	private String minglePartnerType; // entity id
	private double speedMultiplier = 1.0;
}