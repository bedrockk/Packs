package com.bedrockk.behaviorpacks.definition.item;

import com.bedrockk.behaviorpacks.annotation.JsonSince;
import com.bedrockk.behaviorpacks.node.SingleValueNode;

@JsonSince("1.16.100")
public class ShouldDespawnDefinition extends SingleValueNode<Boolean> implements ItemComponentDefinition {
	public ShouldDespawnDefinition(Boolean value) {
		super(value);
	}
}
