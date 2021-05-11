package com.bedrockk.packs.description.definition;

import com.bedrockk.packs.description.DefinitionDescription;
import lombok.Data;

@Data
public class FeatureRuleDefinitionDescription implements DefinitionDescription {
	private String identifier;
	private String placesFeature;
}
