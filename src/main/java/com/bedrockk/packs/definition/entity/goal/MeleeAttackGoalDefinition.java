package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import com.bedrockk.packs.definition.entity.EntityEventTriggerDefinition;
import com.bedrockk.packs.node.PackNode;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
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
	@Builder
	@Jacksonized
	public static class Tracking implements PackNode {
		private int refreshPeriodMin;
		private int refreshPeriodMax;
		@Singular("entry")
		private List<BackoffEntry> backoff;
	}

	@Data
	@Builder
	@Jacksonized
	public static class BackoffEntry implements PackNode {
		private double distanceSquaredGt;
		private int refreshPeriodDelta;
	}
}