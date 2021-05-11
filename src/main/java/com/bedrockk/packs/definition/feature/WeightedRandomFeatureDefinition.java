package com.bedrockk.packs.definition.feature;

import com.bedrockk.packs.definition.FeatureDefinition;
import com.bedrockk.packs.description.definition.SimpleDefinitionDescription;
import com.bedrockk.packs.type.Pair;

import java.util.List;

public class WeightedRandomFeatureDefinition extends FeatureDefinition {
	private SimpleDefinitionDescription description;
	private List<Pair<String, Double>> features;
}
