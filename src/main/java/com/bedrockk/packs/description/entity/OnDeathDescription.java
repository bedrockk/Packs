package com.bedrockk.packs.description.entity;

import com.bedrockk.packs.definition.EntityFilterDefinition;
import com.bedrockk.packs.description.EntityDescription;
import com.bedrockk.packs.type.FilterTarget;
import lombok.Data;

@Data
public class OnDeathDescription implements EntityDescription {
	private String event;
	private EntityFilterDefinition filters;
	private FilterTarget target = FilterTarget.SELF;
}
