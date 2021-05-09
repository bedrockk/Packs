package com.bedrockk.behaviorpacks.definition.entity.goal;

import com.bedrockk.behaviorpacks.definition.entity.EntityComponentDefinition;
import com.bedrockk.behaviorpacks.definition.entity.EntityEventTriggerDefinition;
import com.bedrockk.behaviorpacks.type.ImmutableVec3;
import lombok.Data;

import java.util.List;
import java.util.Locale;

@Data
public class MoveToBlockGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private double speedMultiplier;
	private int tickInterval;
	private double startChance;
	private int searchRange;
	private int searchHeight;
	private double goalRadius;
	private int stayDuration;
	private TargetSelectionType targetSelectionMethod;
	private ImmutableVec3 targetOffset;
	private List<String> targetBlocks;
	private EntityEventTriggerDefinition onStayCompleted;
	private EntityEventTriggerDefinition onReach;

	public enum TargetSelectionType {
		NEAREST,
		RANDOM;

		@Override
		public String toString() {
			return this.name().toLowerCase(Locale.ROOT);
		}
	}
}