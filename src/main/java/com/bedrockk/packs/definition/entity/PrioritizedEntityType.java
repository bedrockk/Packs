package com.bedrockk.packs.definition.entity;

import lombok.Data;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@Data
@SuperBuilder
@Jacksonized
public class PrioritizedEntityType extends EntityType {
	private int priority;
}
