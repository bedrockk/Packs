package com.bedrockk.behaviorpacks.description.definition;

import com.bedrockk.behaviorpacks.description.SingleValueDescription;
import com.fasterxml.jackson.annotation.JsonCreator;

public class IsExperimentalDescription extends SingleValueDescription<Boolean> implements DefinitionDescription {
    @JsonCreator
    public IsExperimentalDescription(Boolean value) {
        super(value);
    }
}
