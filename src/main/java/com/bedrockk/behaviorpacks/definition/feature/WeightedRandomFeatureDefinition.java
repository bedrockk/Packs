package com.bedrockk.behaviorpacks.definition.feature;

import com.bedrockk.behaviorpacks.definition.FeatureDefinition;
import com.bedrockk.behaviorpacks.description.definition.SimpleDefinitionDescription;
import com.bedrockk.behaviorpacks.type.Pair;

import java.util.List;

public class WeightedRandomFeatureDefinition extends FeatureDefinition {
	private SimpleDefinitionDescription description;
	private List<Pair<String, Double>> features;
}
