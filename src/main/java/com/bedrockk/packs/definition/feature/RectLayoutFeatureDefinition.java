package com.bedrockk.packs.definition.feature;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.annotation.MinecraftBeta;
import com.bedrockk.packs.definition.FeatureDefinition;
import com.bedrockk.packs.description.definition.SimpleDefinitionDescription;
import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.Pair;
import lombok.*;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@MinecraftBeta
@JsonSince("1.17.0")
@SuperBuilder
@Jacksonized
public class RectLayoutFeatureDefinition extends FeatureDefinition {
	private SimpleDefinitionDescription description;
	private double ratioOfEmptySpace;
	@Singular
	private List<FeatureArea> featureAreas;

	@Data
	@NoArgsConstructor
	@AllArgsConstructor(staticName = "of")
	public static class FeatureArea implements PackNode {
		private String feature;
		private Pair<Integer, Integer> areaDimensions;
	}
}
