package com.bedrockk.behaviorpacks.definition.entity;

import com.bedrockk.behaviorpacks.node.SingleValueNode;

public class FireImmuneDefinition extends SingleValueNode<Boolean> implements EntityComponentDefinition {
    public FireImmuneDefinition(Boolean value) {
        super(value);
    }
}
