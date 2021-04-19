package com.bedrockk.behaviorpacks.description.definition;

import com.bedrockk.behaviorpacks.description.SingleValueDescription;
import com.fasterxml.jackson.annotation.JsonCreator;

public class IdentifierDescription extends SingleValueDescription<String> implements DefinitionDescription {
    @JsonCreator
    public IdentifierDescription(String value) {
        super(value);
    }
}
