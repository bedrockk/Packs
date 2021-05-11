package com.bedrockk.packs.definition.item;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.node.SingleValueNode;

@JsonSince("1.16.100")
public class DisplayNameDefinition extends SingleValueNode<String> implements ItemComponentDefinition {
	public DisplayNameDefinition(String value) {
		super(value);
	}
}
