package com.bedrockk.packs.definition.feature;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.definition.FeatureDefinition;
import com.bedrockk.packs.description.definition.SimpleDefinitionDescription;
import com.bedrockk.packs.type.BlockReference;
import com.bedrockk.packs.type.ExpressionNode;
import com.bedrockk.packs.type.Pair;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Singular;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

import java.util.List;
import java.util.Locale;

@EqualsAndHashCode(callSuper = true)
@Data
@JsonSince("1.16.220")
@SuperBuilder
@Jacksonized
public class GrowingPlantFeatureDefinition extends FeatureDefinition {
	private SimpleDefinitionDescription description;
	@Singular("heightDist")
	private List<Pair<ExpressionNode, Double>> heightDistribution;
	private GrowthDirection growthDirection;
	private ExpressionNode age;
	@Singular
	private List<Pair<BlockReference, Double>> bodyBlocks;
	@Singular
	private List<Pair<BlockReference, Double>> headBlocks;

	public enum GrowthDirection {
		UP,
		DOWN;

		@Override
		public String toString() {
			return name().toLowerCase(Locale.ENGLISH);
		}
	}
}
