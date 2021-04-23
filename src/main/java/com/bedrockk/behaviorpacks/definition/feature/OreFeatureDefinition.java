package com.bedrockk.behaviorpacks.definition.feature;

import com.bedrockk.behaviorpacks.definition.FeatureDefinition;
import com.bedrockk.behaviorpacks.description.DefinitionDescription;
import com.bedrockk.behaviorpacks.type.BlockReference;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class OreFeatureDefinition extends FeatureDefinition {
    private Map<String, DefinitionDescription> description;
    private int count;
    private BlockReference placesBlock;
    private List<BlockReference> mayReplace;
}
