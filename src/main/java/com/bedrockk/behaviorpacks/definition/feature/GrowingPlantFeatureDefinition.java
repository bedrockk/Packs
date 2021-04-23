package com.bedrockk.behaviorpacks.definition.feature;

import com.bedrockk.behaviorpacks.definition.FeatureDefinition;
import com.bedrockk.behaviorpacks.description.DefinitionDescription;
import com.bedrockk.behaviorpacks.type.BlockReference;
import com.bedrockk.behaviorpacks.type.MolangExpression;
import com.bedrockk.behaviorpacks.type.Pair;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class GrowingPlantFeatureDefinition extends FeatureDefinition {
    private Map<String, DefinitionDescription> description;
    private List<Pair<MolangExpression, Double>> heightDistribution;
    private String growthDirection; // up or down
    private MolangExpression age;
    private List<Pair<BlockReference, Double>> bodyBlocks;
    private List<Pair<BlockReference, Double>> headBlocks;
}
