package com.bedrockk.behaviorpacks.description.definition;

import com.bedrockk.behaviorpacks.description.DefinitionDescription;
import lombok.Data;

@Data
public class FeatureRuleDefinitionDescription implements DefinitionDescription {
	private String identifier;
	private String placesFeature;
}
