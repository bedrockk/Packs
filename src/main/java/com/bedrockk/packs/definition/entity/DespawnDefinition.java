package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.definition.EntityFilterDefinition;
import com.bedrockk.packs.type.Range;
import lombok.Data;

@Data
public class DespawnDefinition implements EntityComponentDefinition {
	private boolean despawnFromChance = true;
	private boolean despawnFromInactivity = true;
	private boolean despawnFromSimulationEdge = true;
	private Range despawnFromDistance;
	private EntityFilterDefinition filters;
	private int minRangeInactivityTimer = 30;
	private int minRangeRandomChance = 800;
	private boolean removeChildEntities = false;
}