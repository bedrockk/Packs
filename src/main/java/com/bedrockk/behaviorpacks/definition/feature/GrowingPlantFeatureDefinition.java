package com.bedrockk.behaviorpacks.definition.feature;

import com.bedrockk.behaviorpacks.definition.FeatureDefinition;
import com.bedrockk.behaviorpacks.description.definition.SimpleDefinitionDescription;
import com.bedrockk.behaviorpacks.type.BlockReference;
import com.bedrockk.behaviorpacks.type.ExpressionNode;
import com.bedrockk.behaviorpacks.type.Pair;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class GrowingPlantFeatureDefinition extends FeatureDefinition {
	private SimpleDefinitionDescription description;
	private List<Pair<ExpressionNode, Double>> heightDistribution;
	private String growthDirection; // up or down
	private ExpressionNode age;
	private List<Pair<BlockReference, Double>> bodyBlocks;
	private List<Pair<BlockReference, Double>> headBlocks;
}
