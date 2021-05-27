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
public class FollowCaravanGoalDefinition implements EntityComponentDefinition {
	private int priority;
	@Builder.Default
	private int entityCount = 1;
	@Singular
	private List<EntityType> entityTypes;
	@Builder.Default
	private double speedMultiplier = 1.0;
}