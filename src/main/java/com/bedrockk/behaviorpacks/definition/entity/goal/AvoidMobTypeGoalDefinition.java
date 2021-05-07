package com.bedrockk.behaviorpacks.definition.entity.goal;

import com.bedrockk.behaviorpacks.definition.entity.EntityComponentDefinition;
import com.bedrockk.behaviorpacks.definition.entity.EntityEventTriggerDefinition;
import com.bedrockk.behaviorpacks.definition.entity.EntityType;
import com.bedrockk.behaviorpacks.type.Range;
import lombok.Data;

import java.util.List;

@Data
public class AvoidMobTypeGoalDefinition implements EntityComponentDefinition {
    private int priority;
    private List<EntityType> entityTypes;
    private boolean ignoreVisibility;
    private boolean removeTarget;
    private double maxDist;
    private double maxFlee;
    private double probabilityPerStrength;
    private double sprintSpeedMultiplier;
    private double walkSpeedMultiplier;
    private EntityEventTriggerDefinition onEscapeEvent;
    private String avoidMobSound;
    private Range soundInterval;
}
