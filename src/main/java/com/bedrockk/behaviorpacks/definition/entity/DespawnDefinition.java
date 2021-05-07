package com.bedrockk.behaviorpacks.definition.entity;

import com.bedrockk.behaviorpacks.definition.EntityFilterDefinition;
import com.bedrockk.behaviorpacks.type.Range;
import lombok.Data;

import java.util.List;

@Data
public class DespawnDefinition implements EntityComponentDefinition{
	private boolean despawnFromChance = true;
	private boolean despawnFromInactivity = true;
	private boolean despawnFromSimulationEdge = true;
	private Range despawnFromDistance;
	private EntityFilterDefinition filters;
	private int minRangeInactivityTimer = 30;
	private int minRangeRandomChance = 800;
	private boolean removeChildEntities = false;
}