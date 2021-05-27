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
public class ShareItemsGoalDefinition implements EntityComponentDefinition {
	private int priority;
	@Singular
	private List<EntityType> entityTypes;
	@Builder.Default
	private double goalRadius = 0.5;
	private double maxDist;
	@Builder.Default
	private double speedMultiplier = 1.0;
}