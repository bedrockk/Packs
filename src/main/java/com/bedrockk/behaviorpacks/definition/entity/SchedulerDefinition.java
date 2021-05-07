package com.bedrockk.behaviorpacks.definition.entity;

import lombok.Data;

import java.util.List;

@Data
public class SchedulerDefinition implements EntityComponentDefinition{
	private int maxDelaySecs;
	private int minDelaySecs;
	private List<EntityEventTriggerDefinition> scheduledEvents;
}