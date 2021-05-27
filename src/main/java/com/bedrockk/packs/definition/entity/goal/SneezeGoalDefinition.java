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
public class SneezeGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private double cooldownTime;
	@Builder.Default
	private double dropItemChance = 1.0;
	@Singular
	private List<EntityType> entityTypes;
	private String lootTable;
	private String prepareSound;
	@Builder.Default
	private double prepareTime = 1.0;
	@Builder.Default
	private double probability = 0.02;
	private String sound;
	private double withinRadius;
}