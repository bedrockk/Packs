package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import com.bedrockk.packs.definition.entity.EntityType;
import lombok.Data;

import java.util.List;

@Data
public class SneezeGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private double cooldownTime = 0.0;
	private double dropItemChance = 1.0;
	private List<EntityType> entityTypes;
	private String lootTable;
	private String prepareSound;
	private double prepareTime = 1.0;
	private double probability = 0.02;
	private String sound;
	private double withinRadius = 0.0;
}