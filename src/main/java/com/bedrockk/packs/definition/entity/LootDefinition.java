package com.bedrockk.packs.definition.entity;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import java.nio.file.Path;

@Data
@Builder
@Jacksonized
public class LootDefinition implements EntityComponentDefinition {
	private Path table;
}
