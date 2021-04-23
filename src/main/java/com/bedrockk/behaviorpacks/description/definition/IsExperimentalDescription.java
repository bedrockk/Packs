package com.bedrockk.behaviorpacks.description.definition;

import com.bedrockk.behaviorpacks.description.DefinitionDescription;
import com.bedrockk.behaviorpacks.node.SingleValueNode;
import com.fasterxml.jackson.annotation.JsonCreator;

public class IsExperimentalDescription extends SingleValueNode<Boolean> implements DefinitionDescription {
    @JsonCreator
    public IsExperimentalDescription(Boolean value) {
        super(value);
    }
}
