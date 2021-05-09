package com.bedrockk.behaviorpacks.definition.item;

import com.bedrockk.behaviorpacks.node.SingleValueNode;

public class MaxStackSizeDefinition extends SingleValueNode<Integer> implements ItemComponentDefinition {
	public MaxStackSizeDefinition(Integer value) {
		super(value);
	}
}
