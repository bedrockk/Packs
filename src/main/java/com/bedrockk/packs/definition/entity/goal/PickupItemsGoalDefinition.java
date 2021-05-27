package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class PickupItemsGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private boolean canPickupAnyItem;
	@Builder.Default
	private boolean canPickupToHandOrEquipment = true;
	@Builder.Default
	private double goalRadius = 0.5;
	private double maxDist;
	private boolean pickupBasedOnChance;
	@Builder.Default
	private double speedMultiplier = 1.0;
	private boolean trackTarget;
}