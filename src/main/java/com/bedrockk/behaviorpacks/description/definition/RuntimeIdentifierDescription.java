package com.bedrockk.behaviorpacks.description.definition;

import com.bedrockk.behaviorpacks.description.DefinitionDescription;
import com.bedrockk.behaviorpacks.node.SingleValueNode;
import com.fasterxml.jackson.annotation.JsonCreator;

public class RuntimeIdentifierDescription extends SingleValueNode<String> implements DefinitionDescription {
    @JsonCreator
    public RuntimeIdentifierDescription(String value) {
        super(value);
    }
}
