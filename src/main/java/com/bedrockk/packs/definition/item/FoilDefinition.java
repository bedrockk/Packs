package com.bedrockk.packs.definition.item;

import com.bedrockk.packs.node.SingleValueNode;

public class FoilDefinition extends SingleValueNode<Boolean> implements ItemComponentDefinition {
	public FoilDefinition(Boolean value) {
		super(value);
	}
}
