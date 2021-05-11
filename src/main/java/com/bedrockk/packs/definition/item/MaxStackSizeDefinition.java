package com.bedrockk.packs.definition.item;

import com.bedrockk.packs.node.SingleValueNode;

public class MaxStackSizeDefinition extends SingleValueNode<Integer> implements ItemComponentDefinition {
	public MaxStackSizeDefinition(Integer value) {
		super(value);
	}
}
