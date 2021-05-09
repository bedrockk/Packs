package com.bedrockk.behaviorpacks.definition.entity;

import lombok.Data;

@Data
public class FollowRangeDefinition implements EntityComponentDefinition {
	private double value;
	private double max;
}
