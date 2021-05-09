package com.bedrockk.behaviorpacks.definition.item;

import com.bedrockk.behaviorpacks.annotation.JsonSince;
import com.bedrockk.behaviorpacks.node.SingleValueNode;

@JsonSince("1.16.100")
public class DamageDefinition extends SingleValueNode<Integer> implements ItemComponentDefinition {
	public DamageDefinition(Integer value) {
		super(value);
	}
}
