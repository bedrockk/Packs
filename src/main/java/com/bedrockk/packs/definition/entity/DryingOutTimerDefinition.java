package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.annotation.MinecraftBeta;
import lombok.Data;

@Data
@MinecraftBeta
@JsonSince("1.17.0")
public class DryingOutTimerDefinition implements EntityComponentDefinition {
	private EntityEventTriggerDefinition dryingOutEvent;
	private EntityEventTriggerDefinition recoverAfterDriedOutEvent;
	private EntityEventTriggerDefinition stoppedDryingOutEvent;
	private double totalTime;
	private double waterBottleRefillTime;
}
