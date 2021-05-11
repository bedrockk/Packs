package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.definition.EntityFilterDefinition;
import com.bedrockk.packs.type.Range;
import lombok.Data;

import java.util.List;

@Data
public class AngryDefinition implements EntityComponentDefinition {
	private String angrySound;
	private boolean broadcastAnger = false;
	private boolean broadcastAngerOnAttack = false;
	private boolean broadcastAngerOnBeingAttacked = false;
	private int broadcastRange = 20;
	private EntityFilterDefinition broadcastFilters;
	private List<String> broadcastTargets;
	private EntityEventTriggerDefinition calmEvent;
	private int duration = 25;
	private int durationDelta = 0;
	private EntityFilterDefinition filters;
	private Range soundInterval;
}