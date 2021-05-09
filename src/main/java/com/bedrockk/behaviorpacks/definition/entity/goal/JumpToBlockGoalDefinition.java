package com.bedrockk.behaviorpacks.definition.entity.goal;

import com.bedrockk.behaviorpacks.annotation.JsonSince;
import com.bedrockk.behaviorpacks.definition.entity.EntityComponentDefinition;
import com.bedrockk.behaviorpacks.type.Range;
import lombok.Data;

@Data
@JsonSince("1.16.200")
public class JumpToBlockGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private int searchWidth;
	private int searchHeight;
	private int minimumPathLength;
	private double scaleFactor;
	private Range cooldownRange;
}