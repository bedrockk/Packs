package com.bedrockk.packs.definition.entity;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class FollowRangeDefinition implements EntityComponentDefinition {
	private double value;
	private double max;
}
