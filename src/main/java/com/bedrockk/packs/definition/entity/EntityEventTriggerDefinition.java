package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.definition.Definition;
import com.bedrockk.packs.definition.EntityFilterDefinition;
import com.bedrockk.packs.type.FilterTarget;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@Data
@SuperBuilder
@Jacksonized
public class EntityEventTriggerDefinition implements Definition {
	private EntityFilterDefinition filters;
	private String event;
	@Builder.Default
	private FilterTarget target = FilterTarget.SELF;
}