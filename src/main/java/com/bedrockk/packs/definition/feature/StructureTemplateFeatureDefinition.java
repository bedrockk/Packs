package com.bedrockk.packs.definition.feature;

import com.bedrockk.packs.definition.FeatureDefinition;
import com.bedrockk.packs.description.definition.SimpleDefinitionDescription;
import com.bedrockk.packs.json.VersionedConverter;
import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.BlockReference;
import com.bedrockk.packs.type.EmptyObject;
import com.bedrockk.packs.utils.FormatVersions;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;
import java.util.Locale;

@EqualsAndHashCode(callSuper = true)
@Data
public class StructureTemplateFeatureDefinition extends FeatureDefinition {
	private SimpleDefinitionDescription description;
	private String structureName;
	private Integer adjustmentRadius;
	private FacingDirection facingDirection;

	@Data
	public static class Constraints implements PackNode {
		private EmptyObject grounded;
		private EmptyObject unburied;
		private BlockIntersection blockIntersection;
	}

	@Data
	public static class BlockIntersection implements PackNode {
		private @JsonAlias("block_whitelist") List<BlockReference> blockAllowlist;
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
