package com.bedrockk.behaviorpacks.definition.biome;

import com.bedrockk.behaviorpacks.node.PackNode;
import com.bedrockk.behaviorpacks.type.ChanceInformation;
import com.bedrockk.behaviorpacks.type.CoordinateEvalOrderType;
import com.bedrockk.behaviorpacks.type.ExpressionNode;
import com.bedrockk.behaviorpacks.type.FeatureCoordinate;
import lombok.Data;

import java.util.HashMap;

@Data
public class ForcedFeaturesDefinition extends HashMap <String, ForcedFeaturesDefinition.Entry> implements BiomeComponentDefinition {

	@Data
	public static class Entry implements PackNode {
		private ExpressionNode iterations;
		private ChanceInformation scatterChance;
		private CoordinateEvalOrderType coordinateEvalOrder;
		private FeatureCoordinate x;
		private FeatureCoordinate y;
		private FeatureCoordinate z;
		private String placesFeature;
	}
}
