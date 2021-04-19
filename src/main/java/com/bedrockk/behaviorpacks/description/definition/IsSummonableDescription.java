package com.bedrockk.behaviorpacks.description.definition;

import com.bedrockk.behaviorpacks.description.SingleValueDescription;
import com.fasterxml.jackson.annotation.JsonCreator;

public class IsSummonableDescription extends SingleValueDescription<Boolean> implements DefinitionDescription {
    @JsonCreator
    public IsSummonableDescription(Boolean value) {
        super(value);
    }
}
