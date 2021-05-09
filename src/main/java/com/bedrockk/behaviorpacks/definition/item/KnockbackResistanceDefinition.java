package com.bedrockk.behaviorpacks.definition.item;

import com.bedrockk.behaviorpacks.annotation.JsonSince;
import com.bedrockk.behaviorpacks.node.SingleValueNode;

@JsonSince("1.16.100")
public class KnockbackResistanceDefinition extends SingleValueNode<Double> implements ItemComponentDefinition {
	public KnockbackResistanceDefinition(Double value) {
		super(value);
	}
}
