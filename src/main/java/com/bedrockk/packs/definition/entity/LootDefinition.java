package com.bedrockk.packs.definition.entity;

import lombok.Data;

import java.nio.file.Path;

@Data
public class LootDefinition implements EntityComponentDefinition {
	private Path table;
}
