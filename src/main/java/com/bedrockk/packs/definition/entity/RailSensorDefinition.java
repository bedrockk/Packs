package com.bedrockk.packs.definition.entity;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class RailSensorDefinition implements EntityComponentDefinition {
	private boolean checkBlockTypes;
	@Builder.Default
	private boolean ejectOnActivate = true;
	private boolean ejectOnDeactivate;
	private EntityEventTriggerDefinition onActivate;
	private EntityEventTriggerDefinition onDeactivate;
	@Builder.Default
	private boolean tickCommandBlockOnActivate = true;
	private boolean tickCommandBlockOnDeactivate;
}