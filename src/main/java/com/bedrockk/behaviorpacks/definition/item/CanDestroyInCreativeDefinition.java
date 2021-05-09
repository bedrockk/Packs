package com.bedrockk.behaviorpacks.definition.item;

import com.bedrockk.behaviorpacks.annotation.JsonSince;
import com.bedrockk.behaviorpacks.node.SingleValueNode;

@JsonSince("1.16.100")
public class CanDestroyInCreativeDefinition extends SingleValueNode<Boolean> implements ItemComponentDefinition {
	public CanDestroyInCreativeDefinition(Boolean value) {
		super(value);
	}
}
