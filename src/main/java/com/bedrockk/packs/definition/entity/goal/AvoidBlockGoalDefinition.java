package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import com.bedrockk.packs.definition.entity.EntityEventTriggerDefinition;
import com.bedrockk.packs.type.BlockReference;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
public class AvoidBlockGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private int tickInterval;
	private double searchRange;
	private double searchHeight;
	private double sprintSpeedMultiplier;
	private double walkSpeedMultiplier;
	private String targetSelectionMethod; // always "nearest" (?)
	@Singular
	private List<BlockReference> targetBlocks;
	private EntityEventTriggerDefinition onEscape;
}
