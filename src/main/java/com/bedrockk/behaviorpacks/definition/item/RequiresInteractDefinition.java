package com.bedrockk.behaviorpacks.definition.item;

import com.bedrockk.behaviorpacks.annotation.JsonSince;
import com.bedrockk.behaviorpacks.node.SingleValueNode;

@JsonSince("1.17.0")
public class RequiresInteractDefinition extends SingleValueNode<Boolean> implements ItemComponentDefinition {
	public RequiresInteractDefinition(Boolean value) {
		super(value);
	}
}
