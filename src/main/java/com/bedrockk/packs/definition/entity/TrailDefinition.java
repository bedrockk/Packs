package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.definition.EntityFilterDefinition;
import com.bedrockk.packs.type.ImmutableVec3;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class TrailDefinition implements EntityComponentDefinition {
	@Builder.Default
	private String blockType = "air";
	private EntityFilterDefinition spawnFilter;
	private ImmutableVec3 spawnOffset;
}