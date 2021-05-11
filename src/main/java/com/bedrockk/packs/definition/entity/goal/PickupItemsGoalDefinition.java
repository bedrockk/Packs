package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Data;

@Data
public class PickupItemsGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private boolean canPickupAnyItem = false;
	private boolean canPickupToHandOrEquipment = true;
	private double goalRadius = 0.5;
	private double maxDist = 0.0;
	private boolean pickupBasedOnChance = false;
	private double speedMultiplier = 1.0;
	private boolean trackTarget = false;
}