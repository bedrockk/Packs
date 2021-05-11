package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.definition.EntityFilterDefinition;
import lombok.Data;

@Data
public class LookAtDefinition implements EntityComponentDefinition {
	private boolean allowInvulnerable = false;
	private EntityFilterDefinition filters;
	private EntityEventTriggerDefinition lookEvent;
	private int lookCooldown;
	private double searchRadius = 10.0;
	private boolean setTarget = true;
}