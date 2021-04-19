package com.bedrockk.behaviorpacks.description.definition;

import com.bedrockk.behaviorpacks.description.SingleValueDescription;
import com.fasterxml.jackson.annotation.JsonCreator;

public class RuntimeIdentifierDescription extends SingleValueDescription<String> implements DefinitionDescription {
    @JsonCreator
    public RuntimeIdentifierDescription(String value) {
        super(value);
    }
}
