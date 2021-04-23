package com.bedrockk.behaviorpacks.description.definition;

import com.bedrockk.behaviorpacks.description.DefinitionDescription;
import com.bedrockk.behaviorpacks.node.SingleValueNode;
import com.fasterxml.jackson.annotation.JsonCreator;

public class IsSpawnableDescription extends SingleValueNode<Boolean> implements DefinitionDescription {
    @JsonCreator
    public IsSpawnableDescription(Boolean value) {
        super(value);
    }
}
