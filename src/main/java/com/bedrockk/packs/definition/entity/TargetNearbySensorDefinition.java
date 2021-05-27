package com.bedrockk.packs.definition.entity;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class TargetNearbySensorDefinition implements EntityComponentDefinition {
	@Builder.Default
	private double insideRange = 1.0;
	private boolean mustSee;
	private EntityEventTriggerDefinition onInsideRange;
	private EntityEventTriggerDefinition onOutsideRange;
	private EntityEventTriggerDefinition onVisionLostInsideRange;
	@Builder.Default
	private double outsideRange = 5.0;
}