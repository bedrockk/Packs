package com.bedrockk.packs.definition.feature;

import com.bedrockk.packs.definition.FeatureDefinition;
import com.bedrockk.packs.description.definition.SimpleDefinitionDescription;
import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.BlockReference;
import com.bedrockk.packs.type.JsonList;
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
public class SingleBlockFeatureDefinition extends FeatureDefinition {
	private SimpleDefinitionDescription description;
	private BlockReference placesBlock;
	private boolean enforcePlacementRules;
	private boolean enforceSurvivabilityRules;
	private MayAttachTo mayAttachTo;
	@Singular("canReplace")
	private List<BlockReference> mayReplace;

	@Data
	@Builder
	@Jacksonized
	public static class MayAttachTo implements PackNode {
		@Builder.Default
		private int minSidesMustAttach = 1;
		private boolean autoRotate;
		private JsonList<BlockReference> top;
		private JsonList<BlockReference> bottom;
		private JsonList<BlockReference> north;
		private JsonList<BlockReference> east;
		private JsonList<BlockReference> south;
		private JsonList<BlockReference> west;
		private JsonList<BlockReference> all;
		private JsonList<BlockReference> sides;
	}
}
