package com.bedrockk.packs.definition.feature;

import com.bedrockk.packs.definition.FeatureDefinition;
import com.bedrockk.packs.description.definition.SimpleDefinitionDescription;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Singular;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@Jacksonized
public class SequenceFeatureDefinition extends FeatureDefinition {
	private SimpleDefinitionDescription description;
	@Singular
	private List<String> features;
}
