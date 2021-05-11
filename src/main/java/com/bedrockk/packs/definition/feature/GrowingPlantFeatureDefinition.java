package com.bedrockk.packs.definition.feature;

import com.bedrockk.packs.definition.FeatureDefinition;
import com.bedrockk.packs.description.definition.SimpleDefinitionDescription;
import com.bedrockk.packs.type.BlockReference;
import com.bedrockk.packs.type.ExpressionNode;
import com.bedrockk.packs.type.Pair;
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
