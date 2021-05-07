package com.bedrockk.behaviorpacks.definition.entity;

import com.bedrockk.behaviorpacks.definition.EntityFilterDefinition;
import lombok.Data;

@Data
public class EntitySensorDefinition implements EntityComponentDefinition{
	private int maximumCount;
	private int minimumCount = 1;
	private boolean relativeRange = true;
	private boolean requireAll = false;
	private double sensorRange = 10.0;
	private EntityFilterDefinition eventFilters;
	private String event;
}