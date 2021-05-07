package com.bedrockk.behaviorpacks.definition.entity;

import com.bedrockk.behaviorpacks.definition.EntityFilterDefinition;
import lombok.Data;

import java.util.List;

@Data
public class LookatDefinition implements EntityComponentDefinition{
	private boolean allowInvulnerable = false;
	private EntityFilterDefinition filters;
	private EntityEventTriggerDefinition lookEvent;
	private int lookCooldown;
	private double searchRadius = 10.0;
	private boolean setTarget = true;
}