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
public class GroupSizeDefinition implements EntityComponentDefinition {

	@Singular
	private List<EntityFilterDefinition> filters;
	@Builder.Default
	private double radius = 16.0;
}