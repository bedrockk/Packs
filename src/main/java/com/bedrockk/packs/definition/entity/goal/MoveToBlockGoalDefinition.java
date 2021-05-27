package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import com.bedrockk.packs.definition.entity.EntityEventTriggerDefinition;
import com.bedrockk.packs.type.ImmutableVec3;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;
import java.util.Locale;

@Data
@Builder
@Jacksonized
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
	@Singular
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