package com.bedrockk.packs.definition.biome;

import com.bedrockk.packs.node.SingleValueNode;

public class IgnoreAutomaticFeaturesDefinition extends SingleValueNode<Boolean> implements BiomeComponentDefinition {
	public IgnoreAutomaticFeaturesDefinition(Boolean value) {
		super(value);
	}
}
