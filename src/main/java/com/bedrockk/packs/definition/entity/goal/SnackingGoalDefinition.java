package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Data;

import java.util.List;

@Data
public class SnackingGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private double snackingCooldown = 7.5;
	private double snackingCooldownMin = 0.5;
	private double snackingStopChance = 0.0017;
	private List<String> items;
}