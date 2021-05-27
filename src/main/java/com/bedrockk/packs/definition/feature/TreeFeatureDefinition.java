package com.bedrockk.packs.definition.feature;

import com.bedrockk.packs.definition.FeatureDefinition;
import com.bedrockk.packs.definition.feature.tree.*;
import com.bedrockk.packs.description.definition.SimpleDefinitionDescription;
import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.BlockReference;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Singular;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@Jacksonized
public class TreeFeatureDefinition extends FeatureDefinition {
	private SimpleDefinitionDescription description;
	@Singular("addBaseBlock")
	private List<BlockReference> baseBlock;
	private BaseCluster baseCluster;
	@Singular("canGrowOn")
	private List<BlockReference> mayGrowOn;
	@Singular("canGrowThrough")
	private List<BlockReference> mayGrowThrough;
	@Singular("canReplace")
	private List<BlockReference> mayReplace;

	private AcaciaTrunk acaciaTrunk;
	private FallenTrunk fallenTrunk;
	private FancyTrunk fancyTrunk;
	private MegaTrunk megaTrunk;
	private Trunk trunk;

	private AcaciaCanopy acaciaCanopy;
	private Canopy canopy;
	private FancyCanopy fancyCanopy;
	private MegaCanopy megaCanopy;
	private MegaPineCanopy megaPineCanopy;
	private PineCanopy pineCanopy;
	private RoofedCanopy roofedCanopy;
	private SpruceCanopy spruceCanopy;
	private RandomSpreadCanopy randomSpreadCanopy;

	@Data
	@Builder
	@Jacksonized
	public static class BaseCluster implements PackNode {
		@Singular("canReplace")
		private List<BlockReference> mayReplace;
		private int numClusters;
		private int clusterRadius;
	}
}
