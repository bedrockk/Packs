package com.bedrockk.behaviorpacks.definition.item;

import com.bedrockk.behaviorpacks.annotation.JsonSince;
import com.bedrockk.behaviorpacks.node.SingleValueNode;

@JsonSince("1.17.0")
public class AnimatesInToolbarDefinition extends SingleValueNode<Boolean> implements ItemComponentDefinition {
	public AnimatesInToolbarDefinition(Boolean value) {
		super(value);
	}
}
