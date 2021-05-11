package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.definition.EntityFilterDefinition;
import lombok.Data;

import java.util.List;

@Data
public class SpawnEntityDefinition implements EntityComponentDefinition {

	private List<EntityFilterDefinition> filters;
	private int maxWaitTime = 600;
	private int minWaitTime = 300;
	private int numToSpawn = 1;
	private boolean shouldLeash = false;
	private boolean singleUse = false;
	private String spawnEntity;
	private String spawnEvent = "minecraft:entity_born";
	private String spawnItem = "egg";
	private String spawnMethod = "born";
	private String spawnSound = "plop";
}