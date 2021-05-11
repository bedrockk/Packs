package com.bedrockk.packs.definition.item;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.node.SingleValueNode;

@JsonSince("1.16.100")
public class CanDestroyInCreativeDefinition extends SingleValueNode<Boolean> implements ItemComponentDefinition {
	public CanDestroyInCreativeDefinition(Boolean value) {
		super(value);
	}
}
