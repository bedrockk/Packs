package com.bedrockk.behaviorpacks.definition.feature;

import com.bedrockk.behaviorpacks.definition.FeatureDefinition;
import com.bedrockk.behaviorpacks.description.definition.SimpleDefinitionDescription;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class SequenceFeatureDefinition extends FeatureDefinition {
	private SimpleDefinitionDescription description;
	private List<String> features;
}
