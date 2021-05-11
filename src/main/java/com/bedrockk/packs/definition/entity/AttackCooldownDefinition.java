package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.type.Range;
import lombok.Data;

@Data
public class AttackCooldownDefinition implements EntityComponentDefinition {
	private Range attackCooldownTime;
	private EntityEventTriggerDefinition attackCooldownCompleteEvent;
}