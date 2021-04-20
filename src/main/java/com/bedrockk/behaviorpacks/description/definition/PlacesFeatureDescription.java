package com.bedrockk.behaviorpacks.description.definition;

import com.bedrockk.behaviorpacks.description.SingleValueDescription;
import com.fasterxml.jackson.annotation.JsonCreator;

public class PlacesFeatureDescription extends SingleValueDescription<String> implements DefinitionDescription {
    @JsonCreator
    public PlacesFeatureDescription(String value) {
        super(value);
    }
}
