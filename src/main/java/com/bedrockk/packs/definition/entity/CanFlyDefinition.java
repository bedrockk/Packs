package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.node.SingleValueNode;

public class CanFlyDefinition extends SingleValueNode<Boolean> implements EntityComponentDefinition {

	public CanFlyDefinition(Boolean value) {
		super(value);
	}
}
