package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import com.bedrockk.packs.definition.entity.EntityEventTriggerDefinition;
import com.bedrockk.packs.type.BlockReference;
import lombok.Data;

import java.util.List;

@Data
public class AvoidBlockGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private int tickInterval;
	private double searchRange;
	private double searchHeight;
	private double sprintSpeedMultiplier;
	private double walkSpeedMultiplier;
	private String targetSelectionMethod; // always "nearest" (?)
	private List<BlockReference> targetBlocks;
	private EntityEventTriggerDefinition onEscape;
}
