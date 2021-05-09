package com.bedrockk.behaviorpacks.definition.entity.goal;

import com.bedrockk.behaviorpacks.definition.entity.EntityComponentDefinition;
import com.bedrockk.behaviorpacks.definition.entity.EntityEventTriggerDefinition;
import com.bedrockk.behaviorpacks.definition.entity.EntityType;
import com.bedrockk.behaviorpacks.type.ImmutableVec3;
import com.bedrockk.behaviorpacks.type.Range;
import lombok.Data;

import java.nio.file.Path;
import java.util.List;

@Data
public class DropItemForGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private int cooldown;
	private double dropItemChance;
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