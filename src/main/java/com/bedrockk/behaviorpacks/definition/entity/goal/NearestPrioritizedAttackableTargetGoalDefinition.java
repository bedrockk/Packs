package com.bedrockk.behaviorpacks.definition.entity.goal;

import com.bedrockk.behaviorpacks.definition.entity.EntityComponentDefinition;
import com.bedrockk.behaviorpacks.definition.entity.PrioritizedEntityType;
import lombok.Data;

import java.util.List;

@Data
public class NearestPrioritizedAttackableTargetGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private int attackInterval = 0;
	private List<PrioritizedEntityType> entityTypes;
	private boolean mustReach = false;
	private boolean mustSee = false;
	private double mustSeeForgetDuration = 3.0;
	private double persistTime = 0.0;
	private boolean reselectTargets = false;
	private int scanInterval = 10;
	private boolean setPersistent = false;
	private double targetSearchHeight;
	private double withinRadius = 0.0;
}