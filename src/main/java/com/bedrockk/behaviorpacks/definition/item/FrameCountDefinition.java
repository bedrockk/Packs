package com.bedrockk.behaviorpacks.definition.item;

import com.bedrockk.behaviorpacks.annotation.JsonSince;
import com.bedrockk.behaviorpacks.node.SingleValueNode;

@JsonSince("1.17.0")
public class FrameCountDefinition extends SingleValueNode<Integer> implements ItemComponentDefinition {
	public FrameCountDefinition(Integer value) {
		super(value);
	}
}
