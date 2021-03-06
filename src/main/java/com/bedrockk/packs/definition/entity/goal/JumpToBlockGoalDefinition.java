package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import com.bedrockk.packs.type.Range;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
@JsonSince("1.16.200")
public class JumpToBlockGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private int searchWidth;
	private int searchHeight;
	private int minimumPathLength;
	private double scaleFactor;
	private Range cooldownRange;
}