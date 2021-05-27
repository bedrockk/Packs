package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import com.bedrockk.packs.definition.entity.EntityEventTriggerDefinition;
import com.bedrockk.packs.definition.entity.EntityType;
import com.bedrockk.packs.type.ImmutableVec3;
import com.bedrockk.packs.type.Range;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.nio.file.Path;
import java.util.List;

@Data
@Builder
@Jacksonized
public class DropItemForGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private int cooldown;
	private double dropItemChance;
	@Singular
	private List<EntityType> entityTypes;
	private double goalRadius;
	private Path lootTable;
	private int maxDist;
	private int maxHeadLookAtHeight;
	private double minimumTeleportDistance;
	private double offeringDistance;
	private EntityEventTriggerDefinition onDropAttempt;
	private int searchCount;
	private int searchHeight;
	private int searchRange;
	private int secondsBeforePickup;
	private double speedMultiplier;
	private Range timeOfDayRange;
	private ImmutableVec3 targetRange;
	private ImmutableVec3 teleportOffset;
}