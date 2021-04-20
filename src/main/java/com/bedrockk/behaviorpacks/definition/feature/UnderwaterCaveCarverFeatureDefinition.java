package com.bedrockk.behaviorpacks.definition.feature;

import com.bedrockk.behaviorpacks.definition.FeatureDefinition;
import com.bedrockk.behaviorpacks.description.definition.DefinitionDescription;
import com.bedrockk.behaviorpacks.type.BlockReference;
import com.bedrockk.behaviorpacks.type.MolangExpression;
import lombok.Data;

import java.util.Map;
import java.util.Optional;

@Data
public class UnderwaterCaveCarverFeatureDefinition extends FeatureDefinition {
    private Map<String, DefinitionDescription> description;
    private BlockReference fillWith;
    private MolangExpression widthModifier;
    private BlockReference replaceAirWith;
}
