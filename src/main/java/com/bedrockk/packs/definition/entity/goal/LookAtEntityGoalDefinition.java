package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.EntityFilterDefinition;
import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import com.bedrockk.packs.type.Range;
import lombok.Data;

import java.util.List;

@Data
public class LookAtEntityGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private int angleOfViewHorizontal = 360;
	private int angleOfViewVertical = 360;
	private List<EntityFilterDefinition> filters;
	private double lookDistance = 8.0;
	private Range lookTime;
	private double probability = 0.02;
}