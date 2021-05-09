package com.bedrockk.behaviorpacks.definition.item;

import com.bedrockk.behaviorpacks.annotation.JsonSince;
import com.bedrockk.behaviorpacks.node.SingleValueNode;

@JsonSince("1.16.100")
public class HoverTextColorDefinition extends SingleValueNode<String> implements ItemComponentDefinition {
	public HoverTextColorDefinition(String value) {
		super(value);
	}
}
