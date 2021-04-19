package com.bedrockk.behaviorpacks.description.definition;

import com.bedrockk.behaviorpacks.description.SingleValueDescription;
import com.fasterxml.jackson.annotation.JsonCreator;

public class IsSpawnableDescription extends SingleValueDescription<Boolean> implements DefinitionDescription {
    @JsonCreator
    public IsSpawnableDescription(Boolean value) {
        super(value);
    }
}
