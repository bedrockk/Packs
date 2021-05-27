package com.bedrockk.packs.description.entity;

import com.bedrockk.packs.definition.EntityFilterDefinition;
import com.bedrockk.packs.description.EntityDescription;
import com.bedrockk.packs.type.FilterTarget;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@Data
@SuperBuilder
@Jacksonized
public class EntityEventTriggerDescription implements EntityDescription {
	private EntityFilterDefinition filters;
	private String event;
	@Builder.Default
	private FilterTarget target = FilterTarget.SELF;
}