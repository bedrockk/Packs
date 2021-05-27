package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.definition.EntityFilterDefinition;
import com.bedrockk.packs.type.Range;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
public class AngryDefinition implements EntityComponentDefinition {
	private String angrySound;
	private boolean broadcastAnger;
	private boolean broadcastAngerOnAttack;
	private boolean broadcastAngerOnBeingAttacked;
	@Builder.Default
	private int broadcastRange = 20;
	private EntityFilterDefinition broadcastFilters;
	@Singular
	private List<String> broadcastTargets;
	private EntityEventTriggerDefinition calmEvent;
	@Builder.Default
	private int duration = 25;
	private int durationDelta;
	private EntityFilterDefinition filters;
	private Range soundInterval;
}