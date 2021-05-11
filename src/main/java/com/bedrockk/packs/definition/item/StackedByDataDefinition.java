package com.bedrockk.packs.definition.item;

import com.bedrockk.packs.node.SingleValueNode;

public class StackedByDataDefinition extends SingleValueNode<Boolean> implements ItemComponentDefinition {
	public StackedByDataDefinition(Boolean value) {
		super(value);
	}
}
