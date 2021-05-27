package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class SlimeRandomDirectionGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private int addRandomTimeRange;
	private double turnRange;
	private int minChangeDirectionTime;
}