package com.bedrockk.behaviorpacks.definition.entity;

import com.bedrockk.behaviorpacks.definition.EntityFilterDefinition;
import lombok.Data;

import java.util.List;

@Data
public class GroupSizeDefinition implements EntityComponentDefinition{
	
	private List<EntityFilterDefinition> filters;
	private double radius = 16.0;
}