package com.bedrockk.packs.definition.feature;

import com.bedrockk.packs.definition.FeatureDefinition;
import com.bedrockk.packs.description.definition.SimpleDefinitionDescription;
import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.BlockReference;
import com.bedrockk.packs.type.EmptyObject;
import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Singular;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

import java.util.List;
import java.util.Locale;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@Jacksonized
public class StructureTemplateFeatureDefinition extends FeatureDefinition {
	private SimpleDefinitionDescription description;
	private String structureName;
	private Integer adjustmentRadius;
	private FacingDirection facingDirection;

	@Data
	@Builder
	@Jacksonized
	public static class Constraints implements PackNode {
		private EmptyObject grounded;
		private EmptyObject unburied;
		private BlockIntersection blockIntersection;
	}

	@Data
	@Builder
	@Jacksonized
	public static class BlockIntersection implements PackNode {
		@Singular("allowedBlock")
		@JsonAlias("block_whitelist")
		private List<BlockReference> blockAllowlist;
	}

	public enum FacingDirection {
		NORTH,
		SOUTH,
		EAST,
		WEST,
		RANDOM;

		@Override
		public String toString() {
			return name().toLowerCase(Locale.ENGLISH);
		}
	}
}
