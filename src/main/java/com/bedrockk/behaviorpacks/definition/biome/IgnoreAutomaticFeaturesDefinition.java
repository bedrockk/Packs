package com.bedrockk.behaviorpacks.definition.biome;

import com.bedrockk.behaviorpacks.node.SingleValueNode;

public class IgnoreAutomaticFeaturesDefinition extends SingleValueNode<Boolean> implements BiomeComponentDefinition {
	public IgnoreAutomaticFeaturesDefinition(Boolean value) {
		super(value);
	}
}
