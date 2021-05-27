package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import com.bedrockk.packs.type.Range;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
public class TemptGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private boolean canGetScared;
	private boolean canTemptVertically;
	@Singular
	private List<String> items;
	@Builder.Default
	private double speedMultiplier = 1.0;
	private double withinRadius;
	private String temptSound;
	private Range soundInterval;
}