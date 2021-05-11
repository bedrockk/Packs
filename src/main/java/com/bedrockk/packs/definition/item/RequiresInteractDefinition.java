package com.bedrockk.packs.definition.item;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.annotation.MinecraftBeta;
import com.bedrockk.packs.node.SingleValueNode;

@MinecraftBeta
@JsonSince("1.17.0")
public class RequiresInteractDefinition extends SingleValueNode<Boolean> implements ItemComponentDefinition {
	public RequiresInteractDefinition(Boolean value) {
		super(value);
	}
}
