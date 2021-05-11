package com.bedrockk.packs.definition.item;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.node.SingleValueNode;

@JsonSince("1.16.100")
public class AllowOffHandDefinition extends SingleValueNode<Boolean> implements ItemComponentDefinition {
	public AllowOffHandDefinition(Boolean value) {
		super(value);
	}
}
