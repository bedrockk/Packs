package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Data;

@Data
public class DelayedAttackGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private double speedMultiplier;
	private boolean attackOnce;
	private boolean requiredCompletePath;
	private double randomStopInterval;
	private double reachMultiplier;
	private double attackDuration;
	private double hitDelayPct;
	private boolean trackTarget;
	private String soundEvent;
}