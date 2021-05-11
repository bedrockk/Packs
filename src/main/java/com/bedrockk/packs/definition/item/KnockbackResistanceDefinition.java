package com.bedrockk.packs.definition.item;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.node.SingleValueNode;

@JsonSince("1.16.100")
public class KnockbackResistanceDefinition extends SingleValueNode<Double> implements ItemComponentDefinition {
	public KnockbackResistanceDefinition(Double value) {
		super(value);
	}
}
