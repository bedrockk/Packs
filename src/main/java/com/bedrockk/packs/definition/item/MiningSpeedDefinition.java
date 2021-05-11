package com.bedrockk.packs.definition.item;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.node.SingleValueNode;

@JsonSince("1.16.100")
public class MiningSpeedDefinition extends SingleValueNode<Integer> implements ItemComponentDefinition {
	public MiningSpeedDefinition(Integer value) {
		super(value);
	}
}
