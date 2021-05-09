package com.bedrockk.behaviorpacks.definition.entity;

import com.bedrockk.behaviorpacks.definition.EntityFilterDefinition;
import com.bedrockk.behaviorpacks.type.ImmutableVec3;
import lombok.Data;

@Data
public class TrailDefinition implements EntityComponentDefinition {
	private String blockType = "air";
	private EntityFilterDefinition spawnFilter;
	private ImmutableVec3 spawnOffset;
}