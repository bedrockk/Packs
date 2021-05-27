package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class MingleGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private double cooldownTime;
	@Builder.Default
	private double duration = 1.0;
	@Builder.Default
	private double mingleDistance = 2.0;
	private String minglePartnerType; // entity id
	@Builder.Default
	private double speedMultiplier = 1.0;
}