package com.bedrockk.behaviorpacks.definition.item;

import com.bedrockk.behaviorpacks.node.SingleValueNode;

public class MaxDamageDefinition extends SingleValueNode<Integer> implements ItemComponentDefinition {
	public MaxDamageDefinition(Integer value) {
		super(value);
	}
}
