package com.bedrockk.behaviorpacks.definition.feature;

import com.bedrockk.behaviorpacks.definition.FeatureDefinition;
import com.bedrockk.behaviorpacks.description.definition.DefinitionDescription;
import com.bedrockk.behaviorpacks.type.*;
import lombok.Data;

import java.util.Map;

@Data
public class ScatterFeatureDefinition extends FeatureDefinition {
    private Map<String, DefinitionDescription> description;
    private BlockReference placesFeature;
    private Boolean projectInputToFloor;
    private MolangExpression iterations;
    private Chance scatterChance;
    private CoordinateEvalOrderType coordinateEvalOrder;
    private FeatureCoordinate x;
    private FeatureCoordinate y;
    private FeatureCoordinate z;
}
