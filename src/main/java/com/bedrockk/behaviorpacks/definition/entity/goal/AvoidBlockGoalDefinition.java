package com.bedrockk.behaviorpacks.definition.entity.goal;

import com.bedrockk.behaviorpacks.definition.entity.EntityComponentDefinition;
import com.bedrockk.behaviorpacks.definition.entity.EntityEventTriggerDefinition;
import com.bedrockk.behaviorpacks.type.BlockReference;
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
