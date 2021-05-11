package com.bedrockk.packs.definition.item;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.node.SingleValueNode;

@JsonSince("1.17.0")
public class FrameCountDefinition extends SingleValueNode<Integer> implements ItemComponentDefinition {
	public FrameCountDefinition(Integer value) {
		super(value);
	}
}
