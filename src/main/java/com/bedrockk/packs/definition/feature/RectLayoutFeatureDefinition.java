package com.bedrockk.packs.definition.feature;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.annotation.MinecraftBeta;
import com.bedrockk.packs.definition.FeatureDefinition;
import com.bedrockk.packs.description.definition.SimpleDefinitionDescription;
import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.BlockReference;
import com.bedrockk.packs.type.Pair;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@MinecraftBeta
@JsonSince("1.17.0")
public class RectLayoutFeatureDefinition extends FeatureDefinition {
	private SimpleDefinitionDescription description;
	private double ratioOfEmptySpace;
	private List<FeatureArea> featureAreas;

	@Data
	public static class FeatureArea implements PackNode {
		private String feature;
		private Pair<Integer, Integer> areaDimensions;
	}
}
