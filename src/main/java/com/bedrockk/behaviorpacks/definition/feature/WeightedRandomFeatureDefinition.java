package com.bedrockk.behaviorpacks.definition.feature;

import com.bedrockk.behaviorpacks.definition.FeatureDefinition;
import com.bedrockk.behaviorpacks.description.DefinitionDescription;
import com.bedrockk.behaviorpacks.type.Pair;

import java.util.List;
import java.util.Map;

public class WeightedRandomFeatureDefinition extends FeatureDefinition {
	private Map<String, DefinitionDescription> description;
	private List<Pair<String, Double>> features;
}
