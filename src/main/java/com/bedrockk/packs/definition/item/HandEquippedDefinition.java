package com.bedrockk.packs.definition.item;

import com.bedrockk.packs.node.SingleValueNode;

public class HandEquippedDefinition extends SingleValueNode<Boolean> implements ItemComponentDefinition {
	public HandEquippedDefinition(Boolean value) {
		super(value);
	}
}
