package com.bedrockk.behaviorpacks.definition.item;

import com.bedrockk.behaviorpacks.node.SingleValueNode;

public class HandEquippedDefinition extends SingleValueNode<Boolean> implements ItemComponentDefinition {
	public HandEquippedDefinition(Boolean value) {
		super(value);
	}
}
