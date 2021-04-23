package com.bedrockk.behaviorpacks.description.definition;

import com.bedrockk.behaviorpacks.description.DefinitionDescription;
import com.bedrockk.behaviorpacks.node.SingleValueNode;
import com.fasterxml.jackson.annotation.JsonCreator;

public class PlacesFeatureDescription extends SingleValueNode<String> implements DefinitionDescription {
    @JsonCreator
    public PlacesFeatureDescription(String value) {
        super(value);
    }
}
