package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import com.bedrockk.packs.definition.entity.EntityEventTriggerDefinition;
import com.bedrockk.packs.definition.entity.EntityType;
import com.bedrockk.packs.type.Range;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
public class AvoidMobTypeGoalDefinition implements EntityComponentDefinition {
	private int priority;
	@Singular
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
