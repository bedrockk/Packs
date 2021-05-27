package com.bedrockk.packs.definition.biome;

import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.ChanceInformation;
import com.bedrockk.packs.type.CoordinateEvalOrderType;
import com.bedrockk.packs.type.ExpressionNode;
import com.bedrockk.packs.type.FeatureCoordinate;
import com.bedrockk.packs.utils.MapBuilder;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import java.util.HashMap;

@Data
public class ForcedFeaturesDefinition extends HashMap<String, ForcedFeaturesDefinition.Entry> implements BiomeComponentDefinition {

	public static MapBuilder<ForcedFeaturesDefinition, String, Entry> builder() {
		return new MapBuilder<>(new ForcedFeaturesDefinition());
	}

	@Data
	@Builder
	@Jacksonized
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
