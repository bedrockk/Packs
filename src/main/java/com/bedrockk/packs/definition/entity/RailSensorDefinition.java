package com.bedrockk.packs.definition.entity;

import lombok.Data;

@Data
public class RailSensorDefinition implements EntityComponentDefinition {
	private boolean checkBlockTypes = false;
	private boolean ejectOnActivate = true;
	private boolean ejectOnDeactivate = false;
	private EntityEventTriggerDefinition onActivate;
	private EntityEventTriggerDefinition onDeactivate;
	private boolean tickCommandBlockOnActivate = true;
	private boolean tickCommandBlockOnDeactivate = false;
}