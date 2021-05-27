package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import com.bedrockk.packs.definition.entity.EntityType;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
public class NearestAttackableTargetGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private int attackInterval;
	private int attackIntervalMin;
	private boolean attackOwner;
	@Singular
	private List<EntityType> entityTypes;
	private boolean mustReach;
	private boolean mustSee;
	@Builder.Default
	private double mustSeeForgetDuration = 3.0;
	private double persistTime;
	private boolean reselectTargets;
	@Builder.Default
	private int scanInterval = 10;
	private boolean setPersistent;
	@Builder.Default
	private double targetInvisibleMultiplier = 0.7;
	private double targetSearchHeight;
	@Builder.Default
	private double targetSneakVisibilityMultiplier = 0.8;
	private double withinRadius;
}