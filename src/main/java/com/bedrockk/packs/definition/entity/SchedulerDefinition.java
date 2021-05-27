package com.bedrockk.packs.definition.entity;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
public class SchedulerDefinition implements EntityComponentDefinition {
	private int maxDelaySecs;
	private int minDelaySecs;
	@Singular
	private List<EntityEventTriggerDefinition> scheduledEvents;
}