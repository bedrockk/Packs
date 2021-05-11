package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Data;

@Data
public class FollowTargetCaptainGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private double followDistance = 0.0;
	private double withinRadius = 0.0;
}