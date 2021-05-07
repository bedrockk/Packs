package com.bedrockk.behaviorpacks.description.entity;

import com.bedrockk.behaviorpacks.definition.EntityFilterDefinition;
import com.bedrockk.behaviorpacks.description.EntityDescription;
import com.bedrockk.behaviorpacks.type.FilterTarget;
import lombok.Data;

import java.util.List;

@Data
public class OnTargetAcquiredDescription implements EntityDescription {
    private String event;
    private List<EntityFilterDefinition> filters;
    private FilterTarget target = FilterTarget.SELF;
}
