package com.bedrockk.behaviorpacks.definition.item;

import com.bedrockk.behaviorpacks.annotation.JsonSince;
import com.bedrockk.behaviorpacks.node.SingleValueNode;

@JsonSince("1.16.100")
public class MiningSpeedDefinition extends SingleValueNode<Integer> implements ItemComponentDefinition {
	public MiningSpeedDefinition(Integer value) {
		super(value);
	}
}
