package com.bedrockk.behaviorpacks.definition.feature;

import com.bedrockk.behaviorpacks.definition.FeatureDefinition;
import com.bedrockk.behaviorpacks.definition.feature.tree.*;
import com.bedrockk.behaviorpacks.description.DefinitionDescription;
import com.bedrockk.behaviorpacks.node.PackNode;
import com.bedrockk.behaviorpacks.type.BlockReference;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;
import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@Data
public class TreeFeatureDefinition extends FeatureDefinition {
	private Map<String, DefinitionDescription> description;
	private List<BlockReference> baseBlock;
	private BaseCluster baseCluster;
	private List<BlockReference> mayGrowOn;
	private List<BlockReference> mayGrowThrough;
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
	public static class BaseCluster implements PackNode {
		private List<BlockReference> mayReplace;
		private int numClusters;
		private int clusterRadius;
	}
}
