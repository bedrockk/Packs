package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.definition.EntityFilterDefinition;
import com.bedrockk.packs.type.Range;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class DespawnDefinition implements EntityComponentDefinition {
	@Builder.Default
	private boolean despawnFromChance = true;
	@Builder.Default
	private boolean despawnFromInactivity = true;
	@Builder.Default
	private boolean despawnFromSimulationEdge = true;
	private Range despawnFromDistance;
	private EntityFilterDefinition filters;
	@Builder.Default
	private int minRangeInactivityTimer = 30;
	@Builder.Default
	private int minRangeRandomChance = 800;
	private boolean removeChildEntities;
}