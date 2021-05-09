package com.bedrockk.behaviorpacks.definition.entity.goal;

import com.bedrockk.behaviorpacks.definition.entity.EntityComponentDefinition;
import com.bedrockk.behaviorpacks.definition.entity.EntityEventTriggerDefinition;
import com.bedrockk.behaviorpacks.node.PackNode;
import lombok.Data;

import java.util.List;

@Data
public class MeleeAttackGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private boolean attackOnce;
	private double maxDist;
	private double meleeFov;
	private double randomStopInterval;
	private double reachMultiplier;
	private boolean requireCompletePath;
	private double speedMultiplier;
	private boolean trackTarget;
	private double targetDist;
	private double lookDistance;
	private int untrackableCooldownDelay;
	private Tracking targetTracking;
	private EntityEventTriggerDefinition onAttack;

	@Data
	public static class Tracking implements PackNode {
		private int refreshPeriodMin;
		private int refreshPeriodMax;
		private List<BackoffEntry> backoff;
	}

	@Data
	public static class BackoffEntry implements PackNode {
		private double distanceSquaredGt;
		private int refreshPeriodDelta;
	}
}