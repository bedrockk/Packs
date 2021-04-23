package com.bedrockk.behaviorpacks.definition.entity;

import com.bedrockk.behaviorpacks.node.SingleValueNode;

public class CanFlyDefinition extends SingleValueNode<Boolean> implements EntityComponentDefinition {

    public CanFlyDefinition(Boolean value) {
        super(value);
    }
}
