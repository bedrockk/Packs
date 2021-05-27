package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class SleepGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private double cooldownTime;
	@Builder.Default
	private double sleepColliderHeight = 1.0;
	@Builder.Default
	private double sleepColliderWidth = 1.0;
	@Builder.Default
	private double sleepYOffset = 1.0;
	@Builder.Default
	private double speedMultiplier = 1.0;
	@Builder.Default
	private double timeoutCooldown = 8.0;
}