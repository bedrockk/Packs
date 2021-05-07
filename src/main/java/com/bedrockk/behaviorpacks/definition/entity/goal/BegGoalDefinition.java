package com.bedrockk.behaviorpacks.definition.entity.goal;

import com.bedrockk.behaviorpacks.definition.entity.EntityComponentDefinition;
import com.bedrockk.behaviorpacks.type.Range;
import lombok.Data;

import java.util.List;

@Data
public class BegGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private double lookDistance = 8.0;
	private Range lookTime;
	private List<String> items;
}