package com.bedrockk.behaviorpacks.description.definition;

import com.bedrockk.behaviorpacks.description.DefinitionDescription;
import com.bedrockk.behaviorpacks.node.SingleValueNode;
import com.fasterxml.jackson.annotation.JsonCreator;

public class IsSummonableDescription extends SingleValueNode<Boolean> implements DefinitionDescription {
    @JsonCreator
    public IsSummonableDescription(Boolean value) {
        super(value);
    }
}
