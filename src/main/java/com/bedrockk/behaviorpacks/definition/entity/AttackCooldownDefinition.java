package com.bedrockk.behaviorpacks.definition.entity;

import com.bedrockk.behaviorpacks.type.Range;
import lombok.Data;

@Data
public class AttackCooldownDefinition implements EntityComponentDefinition {
	private Range attackCooldownTime;
	private EntityEventTriggerDefinition attackCooldownCompleteEvent;
}