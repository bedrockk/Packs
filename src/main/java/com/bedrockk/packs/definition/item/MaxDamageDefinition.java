package com.bedrockk.packs.definition.item;

import com.bedrockk.packs.node.SingleValueNode;

public class MaxDamageDefinition extends SingleValueNode<Integer> implements ItemComponentDefinition {
	public MaxDamageDefinition(Integer value) {
		super(value);
	}
}
