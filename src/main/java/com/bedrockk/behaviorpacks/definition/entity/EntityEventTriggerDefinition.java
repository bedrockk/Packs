package com.bedrockk.behaviorpacks.definition.entity;

import com.bedrockk.behaviorpacks.definition.Definition;
import com.bedrockk.behaviorpacks.definition.EntityFilterDefinition;
import com.bedrockk.behaviorpacks.type.FilterTarget;
import lombok.Data;

@Data
public class EntityEventTriggerDefinition implements Definition {
    private EntityFilterDefinition filters;
    private String event;
    private FilterTarget target = FilterTarget.SELF;
}