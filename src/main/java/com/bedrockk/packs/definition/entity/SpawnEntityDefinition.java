package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.definition.EntityFilterDefinition;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
public class SpawnEntityDefinition implements EntityComponentDefinition {

	@Singular
	private List<EntityFilterDefinition> filters;
	@Builder.Default
	private int maxWaitTime = 600;
	@Builder.Default
	private int minWaitTime = 300;
	@Builder.Default
	private int numToSpawn = 1;
	private boolean shouldLeash;
	private boolean singleUse;
	private String spawnEntity;
	@Builder.Default
	private String spawnEvent = "minecraft:entity_born";
	@Builder.Default
	private String spawnItem = "egg";
	@Builder.Default
	private String spawnMethod = "born";
	@Builder.Default
	private String spawnSound = "plop";
}