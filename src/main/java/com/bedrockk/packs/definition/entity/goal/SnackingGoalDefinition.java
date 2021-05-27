package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
public class SnackingGoalDefinition implements EntityComponentDefinition {
	private int priority;
	@Builder.Default
	private double snackingCooldown = 7.5;
	@Builder.Default
	private double snackingCooldownMin = 0.5;
	@Builder.Default
	private double snackingStopChance = 0.0017;
	@Singular
	private List<String> items;
}