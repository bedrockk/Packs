package com.bedrockk.behaviorpacks.description.entity;

import com.bedrockk.behaviorpacks.definition.EntityFilterDefinition;
import com.bedrockk.behaviorpacks.description.EntityDescription;
import com.bedrockk.behaviorpacks.type.FilterTarget;
import lombok.Data;

import java.util.List;

@Data
public class OnFriendlyAngerDescription implements EntityDescription {
    private String event;
    private EntityFilterDefinition filters;
    private FilterTarget target = FilterTarget.SELF;
}
