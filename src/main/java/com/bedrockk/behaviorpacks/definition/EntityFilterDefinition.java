package com.bedrockk.behaviorpacks.definition;

import com.bedrockk.behaviorpacks.type.FilterOperator;
import com.bedrockk.behaviorpacks.type.FilterTarget;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Locale;

@Data
public class EntityFilterDefinition implements Definition {
    private List<EntityFilterDefinition> allOf;
    private List<EntityFilterDefinition> anyOf;
    private List<EntityFilterDefinition> noneOf;

    private String test;
    private String domain;
    private FilterOperator operator = FilterOperator.EQUALS;
    private FilterTarget subject = FilterTarget.SELF;
    private Object value;
    private String otherWithFamilies;
}
