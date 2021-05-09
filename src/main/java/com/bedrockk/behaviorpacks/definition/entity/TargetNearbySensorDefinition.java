package com.bedrockk.behaviorpacks.definition.entity;

import lombok.Data;

@Data
public class TargetNearbySensorDefinition implements EntityComponentDefinition {
	private double insideRange = 1.0;
	private boolean mustSee = false;
	private EntityEventTriggerDefinition onInsideRange;
	private EntityEventTriggerDefinition onOutsideRange;
	private EntityEventTriggerDefinition onVisionLostInsideRange;
	private double outsideRange = 5.0;
}