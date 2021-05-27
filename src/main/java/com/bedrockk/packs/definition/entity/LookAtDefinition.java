package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.definition.EntityFilterDefinition;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class LookAtDefinition implements EntityComponentDefinition {
	private boolean allowInvulnerable;
	private EntityFilterDefinition filters;
	private EntityEventTriggerDefinition lookEvent;
	private int lookCooldown;
	@Builder.Default
	private double searchRadius = 10.0;
	@Builder.Default
	private boolean setTarget = true;
}