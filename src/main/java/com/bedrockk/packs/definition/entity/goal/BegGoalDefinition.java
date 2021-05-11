package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import com.bedrockk.packs.type.Range;
import lombok.Data;

import java.util.List;

@Data
public class BegGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private double lookDistance = 8.0;
	private Range lookTime;
	private List<String> items;
}