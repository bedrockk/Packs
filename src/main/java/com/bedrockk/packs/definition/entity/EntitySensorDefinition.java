package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.definition.EntityFilterDefinition;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class EntitySensorDefinition implements EntityComponentDefinition {
	private int maximumCount;
	@Builder.Default
	private int minimumCount = 1;
	@Builder.Default
	private boolean relativeRange = true;
	private boolean requireAll;
	@Builder.Default
	private double sensorRange = 10.0;
	private EntityFilterDefinition eventFilters;
	private String event;
}