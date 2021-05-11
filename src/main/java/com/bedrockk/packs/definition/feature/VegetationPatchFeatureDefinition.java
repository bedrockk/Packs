package com.bedrockk.packs.definition.feature;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.annotation.MinecraftBeta;
import com.bedrockk.packs.definition.FeatureDefinition;
import com.bedrockk.packs.description.definition.SimpleDefinitionDescription;
import com.bedrockk.packs.type.BlockReference;
import com.bedrockk.packs.type.Range;
import lombok.Data;

import java.util.List;
import java.util.Locale;

@Data
@MinecraftBeta
@JsonSince("1.17.0")
public class VegetationPatchFeatureDefinition extends FeatureDefinition {
	private SimpleDefinitionDescription description;
	private List<BlockReference> replaceableBlocks;
	private BlockReference groundBlock;
	private String vegetationFeature;
	private SurfaceType surface;
	private Range depth;
	private double extraDeepBlockChance;
	private double verticalRange;
	private double vegetationChance;
	private Range horizontalRadius;
	private double extraEdgeColumnChance;
	private boolean waterlogged;

	public enum SurfaceType {
		FLOOR,
		CEILING;

		@Override
		public String toString() {
			return name().toLowerCase(Locale.ENGLISH);
		}
	}
}
