package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.definition.Definition;
import com.bedrockk.packs.definition.EntityFilterDefinition;
import com.bedrockk.packs.type.FilterTarget;
import lombok.Data;

@Data
public class EntityEventTriggerDefinition implements Definition {
	private EntityFilterDefinition filters;
	private String event;
	private FilterTarget target = FilterTarget.SELF;
}