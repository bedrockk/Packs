package com.bedrockk.behaviorpacks.definition.feature;

import com.bedrockk.behaviorpacks.definition.FeatureDefinition;
import com.bedrockk.behaviorpacks.description.definition.DefinitionDescription;
import com.bedrockk.behaviorpacks.type.BlockReference;
import lombok.Data;

import java.util.List;
import java.util.Locale;
import java.util.Map;

@Data
public class SequenceFeatureDefinition extends FeatureDefinition {
    private Map<String, DefinitionDescription> description;
    private List<BlockReference> features;
}
