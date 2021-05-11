package com.bedrockk.packs.definition.entity;

import lombok.Data;

@Data
public class AddRiderDefinition implements EntityComponentDefinition {

	private String entityType;
	private String spawnEvent;
}