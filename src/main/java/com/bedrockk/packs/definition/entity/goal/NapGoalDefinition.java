package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class NapGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private double cooldownMax;
	private double cooldownMin;
	@Builder.Default
	private double mobDetectDist = 6.0;
	@Builder.Default
	private double mobDetectHeight = 6.0;
}