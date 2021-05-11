package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Data;

import java.util.List;

@Data
public class ChargeHeldItemGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private List<String> items;
}