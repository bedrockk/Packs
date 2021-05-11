package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.node.SingleValueNode;

public class FireImmuneDefinition extends SingleValueNode<Boolean> implements EntityComponentDefinition {
	public FireImmuneDefinition(Boolean value) {
		super(value);
	}
}
