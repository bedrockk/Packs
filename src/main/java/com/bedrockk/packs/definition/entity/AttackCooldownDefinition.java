package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.type.Range;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class AttackCooldownDefinition implements EntityComponentDefinition {
	private Range attackCooldownTime;
	private EntityEventTriggerDefinition attackCooldownCompleteEvent;
}