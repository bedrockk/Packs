package com.bedrockk.behaviorpacks.definition.entity.goal;

import com.bedrockk.behaviorpacks.definition.entity.EntityComponentDefinition;
import lombok.Data;

import java.util.List;

@Data
public class ChargeHeldItemGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private List<String> items;
}