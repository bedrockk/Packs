package com.bedrockk.behaviorpacks.definition.feature;

import com.bedrockk.behaviorpacks.definition.FeatureDefinition;
import com.bedrockk.behaviorpacks.description.DefinitionDescription;
import com.bedrockk.behaviorpacks.type.BlockReference;
import lombok.Data;

import java.util.Map;

@Data
public class SnapToSurfaceFeatureDefinition extends FeatureDefinition {
    private Map<String, DefinitionDescription> description;
    private String featureToSnap;
    private int verticalSearchRange;
    private BlockReference surface;
}
