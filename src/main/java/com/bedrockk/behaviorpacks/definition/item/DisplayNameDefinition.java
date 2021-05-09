package com.bedrockk.behaviorpacks.definition.item;

import com.bedrockk.behaviorpacks.annotation.JsonSince;
import com.bedrockk.behaviorpacks.node.SingleValueNode;

@JsonSince("1.16.100")
public class DisplayNameDefinition extends SingleValueNode<String> implements ItemComponentDefinition {
	public DisplayNameDefinition(String value) {
		super(value);
	}
}
