package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.definition.EntityFilterDefinition;
import lombok.Data;

import java.util.List;

@Data
public class GroupSizeDefinition implements EntityComponentDefinition {

	private List<EntityFilterDefinition> filters;
	private double radius = 16.0;
}