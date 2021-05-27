package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import com.bedrockk.packs.definition.entity.PrioritizedEntityType;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
public class NearestPrioritizedAttackableTargetGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private int attackInterval;
	@Singular
	private List<PrioritizedEntityType> entityTypes;
	private boolean mustReach;
	private boolean mustSee;
	@Builder.Default
	private double mustSeeForgetDuration = 3.0;
	private double persistTime;
	private boolean reselectTargets;
	@Builder.Default
	private int scanInterval = 10;
	private boolean setPersistent;
	private double targetSearchHeight;
	private double withinRadius;
}