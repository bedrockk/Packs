package com.bedrockk.packs.definition.feature;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.annotation.MinecraftBeta;
import com.bedrockk.packs.definition.FeatureDefinition;
import com.bedrockk.packs.description.definition.SimpleDefinitionDescription;
import com.bedrockk.packs.type.BlockReference;
import com.bedrockk.packs.type.Range;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
import java.util.Locale;

@Data
@MinecraftBeta
@JsonSince("1.17.0")
public class GeodeFeatureDefinition extends FeatureDefinition {
	private SimpleDefinitionDescription description;
	private BlockReference filler;
	private BlockReference innerLayer;
	private BlockReference alternateInnerLayer;
	private BlockReference middleLayer;
	private BlockReference outerLayer;
	private List<BlockReference> innerPlacements;
	private int minOuterWallDistance;
	private int maxOuterWallDistance;
	private int minDistributionPoints;
	private int maxDistributionPoints;
	private int maxRadius;
	private int crackPointOffset;
	private double generateCrackChance;
	private int baseCrackSize;
	private double noiseMultiplier;
	private double usePotentialPlacementsChance;
	@JsonProperty("use_alternate_layer0_chance")
	private double useAlternateLayer0Chance;
	@JsonProperty("placements_require_layer0_alternate")
	private boolean placementsRequireLayer0Alternate;
	private int invalidBlocksThreshold;
}
