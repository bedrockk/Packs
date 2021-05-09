package com.bedrockk.behaviorpacks.definition.entity;

import lombok.Data;

@Data
public class InstantDespawnDefinition implements EntityComponentDefinition {

	private boolean removeChildEntities = false;
}