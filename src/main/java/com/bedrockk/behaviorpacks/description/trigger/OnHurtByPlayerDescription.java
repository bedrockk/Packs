package com.bedrockk.behaviorpacks.description.trigger;

import com.bedrockk.behaviorpacks.definition.FilterDefinition;
import lombok.Data;

import java.util.List;

@Data
public class OnHurtByPlayerDescription implements TriggerDescription {
    private String event;
    private List<FilterDefinition> filters;
    private FilterDefinition.Subject target = FilterDefinition.Subject.SELF;
}
