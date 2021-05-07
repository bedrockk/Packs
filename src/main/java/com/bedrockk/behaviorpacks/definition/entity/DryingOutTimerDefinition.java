package com.bedrockk.behaviorpacks.definition.entity;

import com.bedrockk.behaviorpacks.annotation.JsonSince;
import lombok.Data;

@Data
@JsonSince("1.17.0")
public class DryingOutTimerDefinition implements EntityComponentDefinition {
    private EntityEventTriggerDefinition dryingOutEvent;
    private EntityEventTriggerDefinition recoverAfterDriedOutEvent;
    private EntityEventTriggerDefinition stoppedDryingOutEvent;
    private double totalTime;
    private double waterBottleRefillTime;
}
