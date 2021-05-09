package com.bedrockk.behaviorpacks.description.entity;

import com.bedrockk.behaviorpacks.definition.EntityFilterDefinition;
import com.bedrockk.behaviorpacks.description.EntityDescription;
import com.bedrockk.behaviorpacks.type.FilterTarget;
import lombok.Data;

@Data
public class OnWakeWithOwnerDescription implements EntityDescription {
	private String event;
	private EntityFilterDefinition filters;
	private FilterTarget target = FilterTarget.SELF;
}
