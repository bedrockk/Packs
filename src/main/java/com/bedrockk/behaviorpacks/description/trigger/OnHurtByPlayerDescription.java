package com.bedrockk.behaviorpacks.description.trigger;

import com.bedrockk.behaviorpacks.definition.EntityFilterDefinition;
import com.bedrockk.behaviorpacks.type.FilterTarget;
import lombok.Data;

import java.util.List;

@Data
public class OnHurtByPlayerDescription implements TriggerDescription {
    private String event;
    private List<EntityFilterDefinition> filters;
    private FilterTarget target = FilterTarget.SELF;
}
