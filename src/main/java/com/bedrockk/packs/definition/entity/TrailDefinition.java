package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.definition.EntityFilterDefinition;
import com.bedrockk.packs.type.ImmutableVec3;
import lombok.Data;

@Data
public class TrailDefinition implements EntityComponentDefinition {
	private String blockType = "air";
	private EntityFilterDefinition spawnFilter;
	private ImmutableVec3 spawnOffset;
}