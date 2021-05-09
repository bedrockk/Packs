package com.bedrockk.behaviorpacks.definition.entity.goal;

import com.bedrockk.behaviorpacks.definition.EntityFilterDefinition;
import com.bedrockk.behaviorpacks.definition.entity.EntityComponentDefinition;
import lombok.Data;

@Data
public class StalkAndPounceOnTargetGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private double interestTime = 2.0;
	private double leapDist = 0.8;
	private double leapHeight = 0.9;
	private double maxStalkDist = 10.0;
	private double pounceMaxDist = 5.0;
	private boolean setPersistent = false;
	private double stalkSpeed = 1.2;
	private double strikeDist = 2.0;
	private double stuckTime = 2.0;
	private EntityFilterDefinition stuckBlocks;
}