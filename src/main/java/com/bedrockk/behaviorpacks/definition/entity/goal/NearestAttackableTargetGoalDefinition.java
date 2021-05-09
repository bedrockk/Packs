package com.bedrockk.behaviorpacks.definition.entity.goal;

import com.bedrockk.behaviorpacks.definition.entity.EntityComponentDefinition;
import com.bedrockk.behaviorpacks.definition.entity.EntityType;
import lombok.Data;

import java.util.List;

@Data
public class NearestAttackableTargetGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private int attackInterval = 0;
	private int attackIntervalMin = 0;
	private boolean attackOwner = false;
	private List<EntityType> entityTypes;
	private boolean mustReach = false;
	private boolean mustSee = false;
	private double mustSeeForgetDuration = 3.0;
	private double persistTime = 0.0;
	private boolean reselectTargets = false;
	private int scanInterval = 10;
	private boolean setPersistent = false;
	private double targetInvisibleMultiplier = 0.7;
	private double targetSearchHeight;
	private double targetSneakVisibilityMultiplier = 0.8;
	private double withinRadius = 0.0;
}